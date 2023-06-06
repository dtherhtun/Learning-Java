package com.turing.javase4thbatch.chapter6;

class Account {
    private long balance = 0;

    void debit(int amount)
    {
        if (amount >= 0 && amount <= balance)
        {
            this.balance -= amount;
        }
    }

    void credit(int amount)
    {
        this.balance += amount;
    }

    public String toString()
    {
        return "Balance => " + this.balance;
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.debit(-2000);
        System.out.println("Account "+ account);
    }
}
