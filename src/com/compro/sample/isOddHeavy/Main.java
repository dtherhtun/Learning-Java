package com.compro.sample.isOddHeavy;

public class Main {
    public static int isOddHeavy(int[] a){
        if (a.length < 1) return 0;
        int minOdd = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0) {
                if (maxEven < a[i]) {
                    maxEven = a[i];
                }
            } else {
                if (minOdd > a[i]) {
                    minOdd = a[i];
                }
            }
        }
        if (minOdd < maxEven || minOdd == Integer.MAX_VALUE) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[]{1}));
        System.out.println(isOddHeavy(new int[]{2}));
        System.out.println(isOddHeavy(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(isOddHeavy(new int[]{2, 4, 6, 8, 11}));
        System.out.println(isOddHeavy(new int[]{-2, -4, -6, -8, -11}));
    }
}
