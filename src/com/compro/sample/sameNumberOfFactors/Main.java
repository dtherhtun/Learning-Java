package com.compro.sample.sameNumberOfFactors;

public class Main {
    static int sameNumberOfFactors(int n1, int n2) {
        if (n1 < 0 || n2 < 0) return -1;

        return factorCount(n1) == factorCount(n2) ? 1 : 0;
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
        System.out.println(sameNumberOfFactors(-6, 21));
        System.out.println(sameNumberOfFactors(6, 21));
        System.out.println(sameNumberOfFactors(8, 12));
        System.out.println(sameNumberOfFactors(23, 97));
        System.out.println(sameNumberOfFactors(0, 1));
        System.out.println(sameNumberOfFactors(0, 0));
    }
}
