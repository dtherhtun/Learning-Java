package com.compro.sample.isZeroPlentiful;

public class Main {
    static int isZeroPlentiful(int[] a) {
        if (a.length < 4) return 0;
        int total = 0;
        int k = 0;
        
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            if (a[i] == 0) {
                k = i;
                while (a[k] == 0 && k != a.length - 1) {
                    k++;
                    count++;
                }
                i = k;
                if (count >= 4) {
                    total++;
                } else {
                    return 0;
                }
            }
        }

        return total;
    }

//    static int isZeroPlentiful(int[] a) {
//        if (a.length < 4)
//            return 0;
//
//        int count = 0;
//
//        for (int i = 0; i < a.length - 1; ) {
//            if (a[i] == 0 && i + 3 <= a.length) {
//                int j = i;
//                int zeroCount = 0;
//
//                while (j < a.length && a[j] == 0) {
//                    zeroCount++;
//                    j++;
//                }
//
//                if (zeroCount < 4) {
//                    return 0;
//                } else {
//                    count++;
//                }
//
//                i = j;
//            } else i++;
//        }
//
//        return count;
//    }

    public static void main(String[] args) {
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 3, 4}));
        System.out.println(isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{0}));
        System.out.println(isZeroPlentiful(new int[]{}));
        System.out.println(isZeroPlentiful(new int[]{1, 0, 0, 0, 0, 2, 0, 0, 0}));

    }
}
