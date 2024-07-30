package com.compro.sample.MadhavArray2;

public class Main {
    public static int isMadhavArray(int[] a) {
        boolean isCorrectLength = false;
        int n = 2;
        while (a.length >= n * (n + 1) / 2) {
            if (a.length == n * (n + 1) / 2) {
                isCorrectLength = true;
                break;
            } else {
                n++;
            }
        }
        if (!isCorrectLength) return 0;
        int num = 2;
        for (int i = 0; i < a.length; ) {
            int sum = 0;
            for (int j = i; j < i + num; j++) {
                sum = sum + a[j];
            }
            if (a[0] != sum) return 0;
            i = i + num;
            num++;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{6, 3, 3, 1, 2, 3, 1, 5, 0, 0}));
    }
}
