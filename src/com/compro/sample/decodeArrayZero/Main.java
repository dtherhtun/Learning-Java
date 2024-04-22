package com.compro.sample.decodeArrayZero;

public class Main {
    static int decodeArrayZero(int[] a) {
        if (a.length < 1) return 0;
        int k = 0;
        int result = 0;
        int count = 0;
        
        for (int i = 0; i < a.length; i++) {
            k = i;
            count = 0;
            while (a[k] == 0 && k != a.length - 1) {
                count++;
                k++;
            }
            result = result * 10 + count;
            i = k;
        }

        return a[0] < 0 ? -result : result;
    }

    public static void main(String[] args) {
        System.out.println(decodeArrayZero(new int[]{1}));
        System.out.println(decodeArrayZero(new int[]{0, 1}));
        System.out.println(decodeArrayZero(new int[]{-1, 0, 1}));
        System.out.println(decodeArrayZero(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println(decodeArrayZero(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));
    }
}
