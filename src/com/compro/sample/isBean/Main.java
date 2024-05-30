package com.compro.sample.isBean;

public class Main {
    static int isBean(int[] a) {
        boolean is9 = false;
        boolean is13 = false;
        boolean is7 = false;
        boolean is16 = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                is9 = true;
            }
            if (a[i] == 13) {
                is13 = true;
            }
            if (a[i] == 7) {
                is7 = true;
            }
            if (a[i] == 16) {
                is16 = true;
            }
        }

        return (is9 && is13) || (is7 && !is16) || (!is9 && !is13 && !is7 && !is16) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isBean(new int[]{1, 2, 3, 9, 6, 13}));
        System.out.println(isBean(new int[]{3, 4, 6, 7, 13, 15}));
        System.out.println(isBean(new int[]{1, 2, 3, 4, 10, 11, 12}));
        System.out.println(isBean(new int[]{3, 6, 9, 5, 7, 13, 6, 17}));
        System.out.println(isBean(new int[]{9, 6, 18}));
        System.out.println(isBean(new int[]{4, 7, 16}));
    }
}
