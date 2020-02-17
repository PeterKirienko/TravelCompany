package com.solvd.bankomat.model;

import java.math.BigInteger;
import java.util.List;

public class Atm {

    private Long idAtm;
    public Integer id;
    private Bank ownerBank;
    private List<Language> languages;
    private List<BankNote> bankNotes;
    private List<Operation> operations;


   public enum Operation {
        WITHDRAWAL, VIEW_BALANCE
    }

    public Long getId() {
        return idAtm;
    }

    public void setId(Long id) {
        this.idAtm = id;
    }

    public Bank getOwnerBank() {
        return ownerBank;
    }

    public void setOwnerBank(Bank ownerBank) {
        this.ownerBank = ownerBank;
    }

public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public List<BankNote> getBankNotes() {
        return bankNotes;
    }

    public void setBankNotes(List<BankNote> bankNotes) {
        this.bankNotes = bankNotes;
    }

   public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

}
