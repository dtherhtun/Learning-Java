package com.compro.sample.isBalanced3;

public class Main {
    static int isBalanced(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != a[i] % 2) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced(new int[]{2, 3, 6, 7}));
        System.out.println(isBalanced(new int[]{6, 7, 2, 3, 12}));
        System.out.println(isBalanced(new int[]{7, 15, 2, 3}));
        System.out.println(isBalanced(new int[]{16, 6, 2, 3}));
    }
}
