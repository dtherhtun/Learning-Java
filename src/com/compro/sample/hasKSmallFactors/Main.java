package com.compro.sample.hasKSmallFactors;

public class Main {
    static boolean hasKSmallFactors(int k, int n) {
        for (int factor = 2; factor < n; factor++) {
            if (n % factor == 0) {
                int nextFactor = n / factor;
                if (factor < k && nextFactor < k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasKSmallFactors(7, 30));
        System.out.println(hasKSmallFactors(6, 14));
        System.out.println(hasKSmallFactors(6, 30));
    }
}
