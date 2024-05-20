package com.compro.sample.isOddValent;

public class Main {
    static int isOddValent(int[] a) {
        boolean moreOccur = false;
        boolean isContainOdd = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    moreOccur = true;
                }
                if (a[j] % 2 == 1) {
                    isContainOdd = true;
                }
            }
            if (moreOccur && isContainOdd) {
                break;
            }
        }
        return moreOccur && isContainOdd ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isOddValent(new int[]{9, 3, 4, 9, 1}));
        System.out.println(isOddValent(new int[]{3, 3, 3, 3}));
        System.out.println(isOddValent(new int[]{8, 8, 8, 4, 4, 7, 2}));
        System.out.println(isOddValent(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isOddValent(new int[]{2, 2, 2, 4, 4}));
    }
}
