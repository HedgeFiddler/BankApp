package com.bank;

public abstract class AccountHolder {

    protected String name;
    protected Account account;


//    public void addNewAccount(String currency) {
//
//    }

    public double getAccountsBalance() {
        return this.account.getBalance();
    }

    public String getName() {
        return name;
    }

    public abstract void addMoney(double amountOfMoney);

    public abstract void withdrawMoney(double amountOfMoney);


}


