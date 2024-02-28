package com.compro.square;

public class Main {
    public static int isSquare(int n) {
        for (int i = 0; i <= n/2; i++) {
            if (i * i == n) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(4));
    }
}
