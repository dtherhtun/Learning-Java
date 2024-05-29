package com.compro.sample.isHollow2;

public class Main {
    static int isHollow(int[] a) {
        if (a.length < 3 || a[a.length / 2] != 0 || a[(a.length / 2) + 1] != 0 || a[(a.length / 2) - 1] != 0) return 0;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] == 0 && a[i + 1] != 0) {
                return 0;
            }
            if (a[i] == 0 && a[i] != a[a.length - 1 - i] || a[a.length - 1 - i] == 0 && a[i] != a[a.length - 1 - i]) {
                return 0;
            }

        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 2, 1, 2, 18}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5}));
        System.out.println(isHollow(new int[]{3, 8, 3, 0, 0, 0, 3, 3}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 0}));
        System.out.println(isHollow(new int[]{0, 1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{0, 0, 0}));
        System.out.println(isHollow(new int[]{1, 0, 2, 3, 0, 0, 0, 3, 4, 0, 5}));
    }
}
