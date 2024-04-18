package com.compro.sample.isMinMaxDisjoint;

public class Main {
    public static int isMinMaxDisjoint(int[] a) {
        if (a.length < 3) return 0;
        int maxIndex = 0;
        int minIndex = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sametime = 0;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                minIndex = i;
            }
            if (max < a[i]) {
                max = a[i];
                minIndex = i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (min == a[i] || max == a[i]) {
                sametime++;
            }
        }

        if (min == max || minIndex - 1 == maxIndex || minIndex + 1 == maxIndex || sametime > 2) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));
        System.out.println(isMinMaxDisjoint(new int[]{9, 0, 5, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
        System.out.println(isMinMaxDisjoint(new int[]{}));
        System.out.println(isMinMaxDisjoint(new int[]{1, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{1}));
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2}));
    }
}
