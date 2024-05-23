package com.compro.sample.isEvens;

public class Main {
    static int isEvens(int n) {
        while (n > 0) {
            if ((n % 10) % 2 != 0) {
                return 0;
            }
            n /= 10;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isEvens(2426));
        System.out.println(isEvens(3224));
    }
}
