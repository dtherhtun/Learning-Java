package com.compro.sample.isDaphne;

public class Main {
    static int isDaphne(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            } else {
                count--;
            }
        }
        return count == a.length || -count == a.length ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isDaphne(new int[]{2, 4, 2}));
        System.out.println(isDaphne(new int[]{1, 3, 17, -5}));
        System.out.println(isDaphne(new int[]{3, 2, 5}));
    }
}
