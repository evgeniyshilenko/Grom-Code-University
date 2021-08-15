package com.gromcode.lesson8.Accounts;

public class Account {
    String bankName;
    String ownerName;
    int moneyAmount;

    public Account(String bankName, String ownerName, int moneyAmount) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }

    public void depositMoney(int amount) {
        moneyAmount += amount;
    }

    public void changeOwnerName(String newOwnerName) {
        ownerName = newOwnerName;
    }
}
