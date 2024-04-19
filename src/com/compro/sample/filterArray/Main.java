package com.compro.sample.filterArray;

import java.util.Arrays;

public class Main {
    public static int[] filterArray(int[] a, int n) {
        int size = getReturnArraySize(n);
        int[] result = new int[size];

        int j = 0;
        int k = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                if (k >= a.length) return null;
                result[j] = a[k];
                j++;
            }
            k++;
            n = n / 2;
        }

        return result;
    }

    public static int getReturnArraySize(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterArray(new int[]{8, 4, 9, 0, 3, 1, 2}, 88)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 0)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 1)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 2)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 4)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9, 5}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{0, 9, 12, 18, -6}, 11)));
    }
}
