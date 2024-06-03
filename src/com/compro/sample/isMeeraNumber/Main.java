package com.compro.sample.isMeeraNumber;

public class Main {
    static int isMeeraNumber(int n) {
        int i = 2;
        int factorCount = 0;
        while (i < n) {
            if (n % i == 0) {
                factorCount++;
            }
            i++;
        }

        return n % factorCount == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isMeeraNumber(6));
        System.out.println(isMeeraNumber(30));
        System.out.println(isMeeraNumber(21));
    }
}
