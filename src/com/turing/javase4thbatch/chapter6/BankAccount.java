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
        if (amount >= 0)
        {
            this.balance += amount;
        }
    }

    public String toString()
    {
        return "Balance => " + this.balance;
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.credit(5000);
        account1.debit(2000);
        System.out.println("Account "+ account1);
    }
}
