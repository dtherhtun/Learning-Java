package com.compro.sample.factorTwoCount;

public class Main {
    static int factorTwoCount(int n) {
        int count = 0;
        while (n % 2 == 0) {
            n = n / 2;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(factorTwoCount(48));
        System.out.println(factorTwoCount(27));
    }
}
