package com.turing.javase4thbatch.chapter7;

public class Money {
    int amount;
    Money(int amount){
        this.amount = amount;
    }
    Money add(Money another){
        // immutable
        int total = this.amount + another.amount;
        return new Money(total); // object return
    }

    public static void main(String[] args) {
        Money a = new Money(10);
        Money b = new Money(5);
        Money c = a.add(b);

        System.out.println("Money c "+ c.amount);
    }
}
