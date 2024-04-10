package com.compro.sample.isSequentiallyBounded;

public class Main {
    public static int isSequentiallyBounded(int[] a){
        if (a.length == 1 && a[0] < 2) {
            return 0;
        }
        int count = 1;
        for (int i = 1; i < a.length ; i++) {
            if (a[i-1] > a[i] || a[i-1] <= 1) {
                return 0;
            }

            if (a[i-1] == a[i]) {
                count++;
                if (count >= a[i-1] && count >= a[i]) {
                    return 0;
                }
            } else {
                count = 1;
            }
        }
        return 1;
    }

    public static int isSequentiallyBounded2(int[] a) {
        int countSequence = 1;

        if (a.length == 1 && a[0] <= 0)
            return 0;

        for (int index = 0; index < a.length - 1; index++) {
            if (a[index] > a[index + 1])
                return 0;

            if (a[index] == a[index + 1])
                countSequence++;
            else
                countSequence = 1;

            if (a[index] <= countSequence)
                return 0;
        }
        return 1;
    }

    public static int isSequentiallyBounded1(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int currentNum = Integer.MIN_VALUE;
        int count = 0;
        for (int i : a) {
            if (i < currentNum) {
                return 0;
            } else if (i == currentNum) {
                if (++count >= i) {
                    return 0;
                } else {
                    currentNum = i;
                }
            } else {
                count = 1;
                currentNum = i;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[]{0, 1})); // 0
        System.out.println(isSequentiallyBounded(new int[]{-1, 2})); // 0
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5})); // 0
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5, 5})); // 0
        System.out.println(isSequentiallyBounded(new int[]{1, 2, 3})); // 0
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3})); // 0
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3, 1})); // 0
        System.out.println(isSequentiallyBounded(new int[]{1})); // 0
        System.out.println(isSequentiallyBounded(new int[]{})); // 1
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5})); // 1
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99})); // 1
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3})); // 1
//        System.out.println(isSequentiallyBounded1(new int[]{0, 1}));
//        System.out.println(isSequentiallyBounded1(new int[]{-1, 2}));
//        System.out.println(isSequentiallyBounded1(new int[]{}));
//        System.out.println(isSequentiallyBounded1(new int[]{5, 5, 5, 5}));
//        System.out.println(isSequentiallyBounded1(new int[]{5, 5, 5, 2, 5}));
//        System.out.println(isSequentiallyBounded1(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));
//        System.out.println(isSequentiallyBounded1(new int[]{1, 2, 3}));
//        System.out.println(isSequentiallyBounded1(new int[]{2, 3, 3}));
//        System.out.println(isSequentiallyBounded1(new int[]{2, 3, 3, 3, 3}));
//        System.out.println(isSequentiallyBounded1(new int[]{2, 3, 3, 3, 3, 1}));
//        System.out.println(isSequentiallyBounded1(new int[]{1}));
    }
}
//        0
//        0
//        1
//        1
//        0
//        1
//        0
//        1
//        0
//        0
//        0