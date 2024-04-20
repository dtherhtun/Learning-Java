package com.compro.sample.decodeArray;

public class Main {
    static int decodeArray(int[] a) {
        int result = 0;

        for (int i = 0; i < a.length - 1; i++) {
            int temp = 0;
            temp = a[i] - a[i + 1];

            temp = temp < 0 ? -temp : temp;

            result += temp * power(10, a.length - i - 2);
        }

        return a[0] < 0 ? -result : result;
    }

    static int power(int base, int pow) {
        int result = 1;
        while (pow > 0) {
            result = result * base;
            pow--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{2, -3, -2, 6, 9, 18}));
        System.out.println(decodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println(decodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(decodeArray(new int[]{1, 1}));
    }
}
