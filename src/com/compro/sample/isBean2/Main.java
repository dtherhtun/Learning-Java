package com.compro.sample.isBean2;

public class Main {
    static int isBean(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] + 1 == a[j] || a[i] - 1 == a[j]) {
                    flag = true;
                }
            }
            if (!flag) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isBean(new int[]{2, 10, 9, 3}));
        System.out.println(isBean(new int[]{2, 2, 3, 3, 3}));
        System.out.println(isBean(new int[]{1, 1, 1, 2, 1, 1}));
        System.out.println(isBean(new int[]{0, -1, 1}));
        System.out.println(isBean(new int[]{3, 4, 5, 7}));
    }
}
