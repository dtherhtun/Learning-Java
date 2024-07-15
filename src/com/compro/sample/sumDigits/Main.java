package com.compro.sample.sumDigits;

public class Main {
    static int sumDigits(int n) {
        int sum = 0;
        if (n < 0) {
            n = -n;
        }
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(-6543));
    }
}
