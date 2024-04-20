package com.compro.sample.matchPattern;

public class Main {
    static int matchPattern(int[] a, int[] pattern) {
        int i = 0;
        int k = 0;
        int matches = 0;
        for (i = 0; i < a.length; i++) {

            if (a[i] == pattern[k]) {
                matches++;
            } else if (matches == 0 || k == pattern.length - 1) {
                return 0;
            } else {
                if (a[i] != pattern[k + 1]) {
                    return 0;
                }
                k++;
            }
        }

        if (i == a.length && k == pattern.length - 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
//        System.out.println(matchPattern(new int[]{1, 1, 1, 2, 2, 1, 1, 3}, new int[]{1, 2, 1, 3}));
        System.out.println(matchPattern(new int[]{1, 1, 1, 1, 1}, new int[]{1}));
        System.out.println(matchPattern(new int[]{1}, new int[]{1}));
        System.out.println(matchPattern(new int[]{1, 1, 2, 2, 2, 2}, new int[]{1, 2}));
        System.out.println(matchPattern(new int[]{1, 2, 3}, new int[]{1, 2}));
        System.out.println(matchPattern(new int[]{1, 2}, new int[]{1, 2, 3}));
        System.out.println(matchPattern(new int[]{1, 1, 2, 2, 2, 2, 3}, new int[]{1, 3}));
        System.out.println(matchPattern(new int[]{1, 1, 1, 1}, new int[]{1, 2}));
        System.out.println(matchPattern(new int[]{1, 1, 1, 1, 2, 2, 3, 3}, new int[]{1, 2}));
        System.out.println(matchPattern(new int[]{1, 1, 10, 4, 4, 3}, new int[]{1, 4, 3}));
    }
}
