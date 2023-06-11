package com.turing.javase4thbatch.chapter6;

public class Arithmetic {
    int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Arithmetic arth = new Arithmetic();
        int result = arth.add(1, 2);

        System.out.println("Result "+result);
    }
}
