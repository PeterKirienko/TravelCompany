package com.solvd.bankomat.tests;

import com.solvd.bankomat.model.*;
import com.solvd.bankomat.service.impl.BankAccountServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankAccountServiceTests {
    Card card;
    BankAccountServiceImpl bankAccountService;
    BankAccount bankAccountInBYN;
    Transaction transactionInBYN;
    Transaction transactionInUSD;
    ExchangeRate exchangeRatePurchase;
    ExchangeRate exchangeRateSell;
    BigDecimal testRatePurchase;
    BigDecimal testRateSell;


    @BeforeTest
    public void initBankAccountService() {
        bankAccountService = new BankAccountServiceImpl();
        bankAccountInBYN = new BankAccount();
        bankAccountInBYN.setCurrency(Currency.BYN);

        Bank bank = new Bank();
        testRatePurchase = BigDecimal.valueOf(2.17);
        testRateSell = BigDecimal.valueOf(0.46);

        exchangeRatePurchase = new ExchangeRate();
        exchangeRatePurchase.setAction(ExchangeRate.Action.PURCHASE);
        exchangeRatePurchase.setCurrency(Currency.USD);
        exchangeRatePurchase.setRate(testRatePurchase);

        exchangeRateSell = new ExchangeRate();
        exchangeRateSell.setAction(ExchangeRate.Action.SALE);
        exchangeRateSell.setCurrency(Currency.BYN);
        exchangeRateSell.setRate(testRateSell);

        List<ExchangeRate> exchangeRates = new ArrayList<>();
        exchangeRates.add(exchangeRatePurchase);
        exchangeRates.add(exchangeRateSell);

        bank.setExchangeRates(exchangeRates);
        bankAccountInBYN.setBank(bank);

        transactionInBYN = new Transaction();
        transactionInBYN.setCurrency(Currency.BYN);
        transactionInBYN.setAmount(BigDecimal.valueOf(120.50));

        transactionInUSD = new Transaction();
        transactionInUSD.setCurrency(Currency.USD);
        transactionInUSD.setAmount(BigDecimal.valueOf(49.99));
    }

    @Test
    public void convertAmountInSameCurrency()
    {
        BigDecimal convertedAmount;
        convertedAmount = bankAccountService.convertAmount(bankAccountInBYN, transactionInBYN);
        Assert.assertEquals(convertedAmount, transactionInBYN.getAmount());
    }

    @Test
    public void convertAmountInDifferentCurrency()
    {
        BigDecimal convertedAmount;
        convertedAmount = bankAccountService.convertAmount(bankAccountInBYN, transactionInUSD);
        Assert.assertEquals(convertedAmount, transactionInUSD.getAmount().multiply(testRateSell));
    }
    }
