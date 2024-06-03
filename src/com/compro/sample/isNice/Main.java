package com.compro.sample.isNice;

public class Main {
    static int isNice(int[] a) {

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length; j++) {
                if (i != j && (a[i] == a[j] + 1) || (a[i] == a[j] - 1)) {
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
        System.out.println(isNice(new int[]{2, 10, 9, 3}));
        System.out.println(isNice(new int[]{2, 2, 3, 3, 3}));
        System.out.println(isNice(new int[]{1, 1, 1, 2, 1, 1}));
        System.out.println(isNice(new int[]{0, -1, 1}));
        System.out.println(isNice(new int[]{3, x, 5, 7}));
    }
}
