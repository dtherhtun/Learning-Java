package com.compro.sample.convertToBase10;

public class Main {
    public static int isLegalNumber(int[] a, int base) {
        if (a.length < 1) return 0;
        for (int j : a) {
            if (j >= base) {
                return 0;
            }
        }
        return 1;
    }

    public static int pow(int base, int pow) {
        int result = 1;
        while (pow != 0) {
            result = result * base;
            pow--;
        }
        return result;
    }

    public static int convertToBase10(int[] a, int base) {
        if (isLegalNumber(a, base) != 1) return 0;
        int j = 0;
        int sum = 0;
        for (int i = a.length - 1; i >= 0; i--, j++) {
            sum += a[i] * pow(base, j);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[]{1, 0, 1, 1}, 2));
        System.out.println(convertToBase10(new int[]{1, 1, 2}, 3));
        System.out.println(convertToBase10(new int[]{3, 2, 5}, 8));
        System.out.println(convertToBase10(new int[]{3, 7, 1}, 6));
    }
}
