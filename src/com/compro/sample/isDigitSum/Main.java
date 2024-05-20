package com.compro.sample.isDigitSum;

public class Main {
    static int isDigitSum(int n, int m) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum < m ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isDigitSum(32121, 10));
        System.out.println(isDigitSum(32121, 9));
        System.out.println(isDigitSum(13, 6));
        System.out.println(isDigitSum(3, 3));
    }
}
