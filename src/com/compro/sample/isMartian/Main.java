package com.compro.sample.isMartian;

public class Main {
    static int isMartian(int[] a) {
        int oneCount = 0;
        int twoCount = 0;

//        int j = 0;
//
//        for (int i = 0; i < a.length; i++, j++) {
//            if (i == j) {
//                j--;
//            } else {
//                if (a[j] == a[i]) {
//                    return 0;
//                }
//            }
//
//            if (a[i] == 1) {
//                oneCount++;
//            }
//            if (a[i] == 2) {
//                twoCount++;
//            }
//        }

        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1 && a[i] == a[i + 1]) {
                return 0;
            }

            if (a[i] == 1) {
                oneCount++;
            }
            if (a[i] == 2) {
                twoCount++;
            }
        }

        return oneCount > twoCount ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isMartian(new int[]{1, 3}));
        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));
        System.out.println(isMartian(new int[]{1, 1, 3, 2}));
        System.out.println(isMartian(new int[]{1, 3, 2, 2, 1, 5, 1, 5}));
        System.out.println(isMartian(new int[]{1, 2, -18, -18, 1, 2}));
        System.out.println(isMartian(new int[]{}));
        System.out.println(isMartian(new int[]{1}));
        System.out.println(isMartian(new int[]{2}));
    }
}
