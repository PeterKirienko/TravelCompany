package com.solvd.bankomat.model;

import java.math.BigInteger;
import java.util.List;

public class Bank {

    private BigInteger idBank;
//    private Integer id;

    private String name;
    private Currency defaultCurrency;
    private List<ExchangeRate> exchangeRates;


    public BigInteger getidBank() {
        return idBank;
    }

    public void setidBank(BigInteger id) {
        this.idBank = id;
    }

//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ExchangeRate> getExchangeRates() {
        return exchangeRates;
    }

    public void setExchangeRates(List<ExchangeRate> exchangeRates) {
        this.exchangeRates = exchangeRates;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }
}
