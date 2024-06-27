package com.compro.sample.isAllPossibilities2;

public class Main {
    static int isAllPossibilities(int[] a) {
        if (a.length == 0) return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > a.length - 1 || a[i] < 0) {
                return 0;
            }
            boolean flag = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{1, 2, 0, 3}));
        System.out.println(isAllPossibilities(new int[]{3, 2, 1, 0}));
        System.out.println(isAllPossibilities(new int[]{1, 2, 4, 3}));
        System.out.println(isAllPossibilities(new int[]{0, 2, 3}));
        System.out.println(isAllPossibilities(new int[]{0}));
        System.out.println(isAllPossibilities(new int[]{}));
    }
}
