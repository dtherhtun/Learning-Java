package com.compro.sample.primeCount;

public class Main {
    public static int primeCount(int start, int end) {
        if (start> end) return 0;
        int result = 0;
        for (int i = start; i <= end ; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11, 29));
        System.out.println(primeCount(20, 22));
        System.out.println(primeCount(1, 1));
        System.out.println(primeCount(5, 5));
        System.out.println(primeCount(6, 2));
        System.out.println(primeCount(-10, 6));
    }
}
