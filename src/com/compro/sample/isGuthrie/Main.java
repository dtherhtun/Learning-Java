package com.compro.sample.isGuthrie;

public class Main {
    static int isGuthrie(int n) {
        int i = 1;
        int j = 1;
        while (i <= n) {
            if (n == i) {
                return 1;
            }
            i += j;
            j++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isGuthrie(16));
        System.out.println(isGuthrie(11));
        System.out.println(isGuthrie(22));
        System.out.println(isGuthrie(8));
        System.out.println(isGuthrie(1));
        System.out.println(isGuthrie(99));
    }
}
