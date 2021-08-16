package com.gromcode.lesson8.Accounts;

public class CheckingAccount extends Account {
    int limitOfExpences;

    public CheckingAccount(String bankName, String ownerName, int moneyAmount, int limitOfExpences) {
        super(bankName, ownerName, moneyAmount);
        this.limitOfExpences = limitOfExpences;
    }

    public void withdraw(int amount) {
        if (amount > limitOfExpences)
            return;
        moneyAmount -= amount;
    }
}
