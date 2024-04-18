package com.compro.sample.isGuthrieSequence;

public class Main {
    static int isGuthrieSequence(int[] a) {
        if (a.length < 2 || a[a.length - 1] != 1) return 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                if (a[i] / 2 != a[i + 1]) {
                    return 0;
                }
            } else {
                if ((a[i] * 3) + 1 != a[i + 1]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 17, 4, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2}));
    }
}
