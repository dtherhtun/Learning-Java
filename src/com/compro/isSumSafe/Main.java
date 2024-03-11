package com.compro.isSumSafe;

public class Main {
    public static int isSumSafe(int[] a) {
        if (a.length == 0) return 0;
        int sum = 0;
        for (int i: a){
            sum += i;
        }
        for (int i: a){
            if (i == sum) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSumSafe(new int[ ] {5, -5, 0}));
        System.out.println(isSumSafe(new int[ ] {5, -2, 1}));
    }
}
