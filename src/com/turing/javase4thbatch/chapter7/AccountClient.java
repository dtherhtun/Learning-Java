package com.turing.javase4thbatch.chapter7;

public class AccountClient {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.credit(100);
        acc.debit(50);

        System.out.println("Account "+ acc);
    }
}
