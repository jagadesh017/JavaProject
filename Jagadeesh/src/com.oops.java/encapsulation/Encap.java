package com.oops.java.encapsulation;
//wrapping up the data (variables) and the methods that operate on that data into a single unit
//bundling data and methods together.
// data hiding - private
//Controlled Access- setters and getters
//Validation- 

class BankAccount {
   
    private double balance;
    private String accountNumber;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {    
        this.accountNumber = accountNumber;
    }

    public double getBalance() { 
        return balance; 
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance > 0) this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

}

