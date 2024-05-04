package com.compro.sample.isSquareEfficient;

public class Main {
    static int isSquare(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        int i = 1;
        while (i * i <= n) {
            if (i * i == n) {
                return 1;
            }
            i++;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(9));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
        System.out.println(isSquare(82));
        System.out.println(isSquare(145));
        System.out.println(isSquare(100000));
    }
}
