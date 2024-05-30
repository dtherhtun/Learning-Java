package com.compro.sample.countDigit;

public class Main {
    static int countDigit(int n, int d) {
        if (n < 0) return -1;
        int result = 0;
        while (n > 0) {
            if (n % 10 == d) {
                result++;
            }
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countDigit(32121, 1));
        System.out.println(countDigit(33331, 3));
        System.out.println(countDigit(33331, 6));
        System.out.println(countDigit(3, 3));
        System.out.println(countDigit(-543, 3));
    }
}
