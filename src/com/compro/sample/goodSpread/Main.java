package com.compro.sample.goodSpread;

public class Main {
    static int goodSpread(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > 3) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(goodSpread(new int[]{2, 1, 2, 5, 2, 1, 5, 9}));
        System.out.println(goodSpread(new int[]{3, 1, 3, 1, 3, 5, 5, 3}));
    }
}
