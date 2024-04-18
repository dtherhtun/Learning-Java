package com.compro.sample.solve10;

import java.util.Arrays;

public class Main {

    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int[] solve10() {
        int[] result = new int[2];
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (factorial(i) + factorial(j) == factorial(10)) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve10()));
    }
}
