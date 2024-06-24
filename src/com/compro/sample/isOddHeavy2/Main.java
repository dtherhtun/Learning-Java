package com.compro.sample.isOddHeavy2;

public class Main {
    static int isOddHeavy(int[] a) {
        int minOdd = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] > maxEven) {
                maxEven = a[i];
            }
            if (a[i] % 2 == 1 && a[i] < minOdd) {
                minOdd = a[i];
            }
        }

        return minOdd > maxEven && minOdd != Integer.MAX_VALUE ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 8}));
        System.out.println(isOddHeavy(new int[]{1}));
        System.out.println(isOddHeavy(new int[]{1, 1, 1, 1}));
        System.out.println(isOddHeavy(new int[]{2, 4, 6, 8, 11}));
        System.out.println(isOddHeavy(new int[]{-2, -4, -6, -8, -11}));
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 3, 10}));
        System.out.println(isOddHeavy(new int[]{2}));
    }
}
