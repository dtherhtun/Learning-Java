package com.compro.sample.isBalanced;

public class Main {
    static int isBalanced(int[] a) {
        int unique = 0;
        int balance = 0;
        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                } else if (a[i] + a[j] == 0) {
                    balance++;
                }
            }
            if (i == j) {
                unique++;
            }
        }

        return unique % 2 == 0 && balance >= unique / 2 ? 1 : 0;
    }

    static int isBalancedBySum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (i == j) {
                sum += a[i];
            }
        }

        return sum == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isBalancedBySum(new int[]{-2, 3, 2, -3}));
        System.out.println(isBalancedBySum(new int[]{-2, 2, 2, 2}));
        System.out.println(isBalancedBySum(new int[]{-5, 2, -2}));
        System.out.println(isBalancedBySum(new int[]{-2, 2, 2, -4}));
    }
}
