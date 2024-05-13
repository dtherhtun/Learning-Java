package com.compro.sample.updateMileageCounter;

import java.util.Arrays;

public class Main {
    static void updateMileageCounter(int[] a, int miles) {
        long updateMiles = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            updateMiles = (updateMiles * 10) + a[i];
        }
        updateMiles = updateMiles + miles;

        int i = 0;
        while (updateMiles > 0 && i < a.length) {
            a[i] = (int) (updateMiles % 10);
            updateMiles /= 10;
            i++;
        }
    }

    static void updateMileageCounter1(int[] a, int miles) {
        int carry = miles;

        for (int i = 0; i < a.length; i++) {
            int temp = a[i] + carry;
            a[i] = temp % 10;
            carry = temp / 10;
        }
    }

    public static void main(String[] args) {
        int[] test1 = {8, 9, 9, 5, 0};
        int[] test2 = {8, 9, 9, 5, 0};
        int[] test3 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] test4 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        updateMileageCounter1(test1, 1);
        updateMileageCounter1(test2, 2);
        updateMileageCounter1(test3, 1);
        updateMileageCounter1(test4, 13);
        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
        System.out.println(Arrays.toString(test3));
        System.out.println(Arrays.toString(test4));
    }
}
