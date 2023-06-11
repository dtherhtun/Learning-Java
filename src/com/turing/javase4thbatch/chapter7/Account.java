package com.turing.javase4thbatch.chapter7;

public class Account {
    private int balance;

    public void debit(int amount){
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Invalid debit operation");
        }
    }

    public void credit(int amount) {
        if (amount >= 0 ) {
            this.balance += amount;
        } else {
            System.out.println("Invalid credit operation");
        }
    }

    @Override
    public String toString() {
        return "balance ["+balance+"]";
    }
}
