package com.compro.carry;

import java.util.Arrays;

public class Main {
    public static int[] updateMileage(int[] mileage, int mile) {
        int carry = mile;

        for (int i = 0; i < mileage.length; i++) {
            int temp = mileage[i] + carry;
            mileage[i] = temp % 10;
            carry = temp / 10;
        }
        return mileage;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(updateMileage(new int[]{8, 9, 9, 5, 0}, 1)));
        System.out.println(Arrays.toString(updateMileage(new int[]{8, 9, 9, 5, 0}, 2)));
        System.out.println(Arrays.toString(updateMileage(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9} , 1)));
        System.out.println(Arrays.toString(updateMileage(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9} , 13)));
    }
}
