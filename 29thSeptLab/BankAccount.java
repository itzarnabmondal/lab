package com.demo.lab;

class Customer {
    private int accountNumber;
    private String accountName;
    private double accountBalance;
    public void createAccount(int accNum, String accName, double accBal) { // For creating Account
        accountNumber = accNum;
        this.accountName = accName;
        accountBalance = accBal;
    }
    public void setAmount(double amount) { // For Adding Amount
        accountBalance += amount;
    }
    public void getAmount() { // For printing account details
        System.out.println("Account Holder: "+accountName);
        System.out.println("Account Balance: "+accountBalance);
    }
    public void withDrawAmount(double amount) { // For withdraw
        accountBalance-=amount;
        System.out.println("Withdraw of INR "+amount+" successful. \nYour updated balance is: "+accountBalance);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Customer arnab = new Customer(); // Creating 1st Account
        arnab.createAccount(734462728, "Arnab Mondal", 100000.00);
        arnab.setAmount(50000.00); // Calling setAmount Method
        arnab.getAmount(); // Calling getAmount Method
        arnab.withDrawAmount(50000.00); // calling withDrawAmount method
        System.out.println("__________________");
        Customer arpan = new Customer(); // Creating 2nd Account
        arpan.createAccount(734462728, "Arpan Biswas", 200000.00);
        arpan.setAmount(50000.00);
        arpan.getAmount();
        arpan.withDrawAmount(100000.00);
    }
}