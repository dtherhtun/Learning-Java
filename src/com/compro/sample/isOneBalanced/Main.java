package com.compro.sample.isOneBalanced;

public class Main {
    static int isOneBalanced(int[] a) {
        if (a.length == 0) return 1;
        int count = 0;
        boolean one2timesFound = false;
        boolean nonFound = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;
                if (nonFound) {
                    one2timesFound = true;
                }
            } else {
                if (one2timesFound) {
                    return 0;
                }
                nonFound = true;
                count--;
            }
        }

        return count == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0}));
        System.out.println(isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1}));
        System.out.println(isOneBalanced(new int[]{}));
        System.out.println(isOneBalanced(new int[]{3, 4, 1, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 3, 4}));
        System.out.println(isOneBalanced(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 1, 1, 1}));
    }
}
