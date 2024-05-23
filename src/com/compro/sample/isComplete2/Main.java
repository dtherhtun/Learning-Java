package com.compro.sample.isComplete2;

public class Main {
    static int isComplete(int[] a) {
        if (a.length < 3) return 0;
        int min = -1;
        int max = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
            if (a[i] % 2 == 0 && min == -1) {
                min = i;
            } else if (a[i] % 2 == 0) {
                max = i;
            }
        }
        if (min == max) {
            return 0;
        }
        while (min < max) {
            if (a[min] == a[min + 1]) {
                min++;
                continue;
            }
            if (a[min] + 1 != a[min + 1]) {
                return 0;
            }
            min++;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
        System.out.println(isComplete(new int[]{5, 7, 9, 13}));
        System.out.println(isComplete(new int[]{2, 2}));
        System.out.println(isComplete(new int[]{2, 6, 3, 4}));
    }
}
