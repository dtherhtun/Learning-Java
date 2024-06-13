package com.compro.sample.factorEqual;

public class Main {
    static int factorEqual(int n, int m) {
        return factorCount(n) == factorCount(m) ? 1 : 0;
    }

    static int factorCount(int n) {
        int count = 0;
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }

        return count;
    }


    public static void main(String[] args) {
        System.out.println(factorEqual(10, 33));
        System.out.println(factorEqual(9, 10));
    }
}
