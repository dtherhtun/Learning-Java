package com.compro.sample.isBunker2;

public class Main {
    static int isBunker(int n) {
        int i = 0;
        int seq = 1;
        while (i <= n) {
            if (seq == n) {
                return 1;
            }
            seq += i;
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isBunker(1));
        System.out.println(isBunker(2));
        System.out.println(isBunker(4));
        System.out.println(isBunker(7));
        System.out.println(isBunker(8));
    }
}
