package com.compro.sample.isComplete;

public class Main {
    static int isComplete(int[] a) {
        if (a.length < 2) return 0;
        boolean isEven = false;
        boolean isSq = false;
        boolean is8 = false;
        for (int i = 0; i < a.length; i++) {
            if (isSquare(a[i]) && a[i] != 1 && !isSq) {
                isSq = true;
            }
            if (a[i] % 2 == 0 && !isEven) {
                isEven = true;
            }
            if (isEven && isSq && is8) {
                return 1;
            }
            for (int j = i + 1; j < a.length && !is8; j++) {
                if (a[i] + a[j] == 8) {
                    is8 = true;
                    break;
                }
            }
        }
        return 0;
    }

    static boolean isSquare(int n) {
        if (n <= 0) return false;
        int i = 1;
        while (i * i <= n) {
            if (i * i == n) {
                return true;
            }
            i++;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{3, 2, 9, 5}));
        System.out.println(isComplete(new int[]{36, -28}));
        System.out.println(isComplete(new int[]{36, 28}));
        System.out.println(isComplete(new int[]{4}));
        System.out.println(isComplete(new int[]{3, 2, 1, 1, 5, 6}));
        System.out.println(isComplete(new int[]{3, 7, 23, 13, 107, -99, 97, 81}));
    }
}
