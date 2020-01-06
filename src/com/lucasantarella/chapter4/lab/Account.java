package com.lucasantarella.chapter4.lab;

public class Account {

    private double balance;
    private String name;
    private long acctNum;

    public Account(double balance, String name, long acctNum) {
        this.balance = balance;
        this.name = name;
        this.acctNum = acctNum;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return String.format("%s : %.2f", this.name, this.getBalance());
    }

    public double chargeFee() {
        this.withdraw(10.00);
        return this.getBalance();
    }

    public void transfer(Account destination, double amount) {
        destination.deposit(amount);
        this.withdraw(amount);
    }

    public void changeName(String newName) {
        this.name = newName;
    }

}
