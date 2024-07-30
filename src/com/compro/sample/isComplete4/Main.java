package com.compro.sample.isComplete4;

public class Main {
    static int isComplete(int[] a) {
        int maxEven = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                return 0;
            }
            if (a[i] % 2 == 0 && maxEven < a[i]) {
                maxEven = a[i];
            }
        }
        int i = 2;
        while (i < maxEven) {
            boolean flag = false;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    flag = true;
                }
            }
            if (!flag) {
                return 0;
            }
            i += 2;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
        System.out.println(isComplete(new int[]{2, 3, 3, 6}));
        System.out.println(isComplete(new int[]{2, -3, 4, 3, 6}));
    }
}
