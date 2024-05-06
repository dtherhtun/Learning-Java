package com.compro.sample.loopSum;

public class Main {
//        static int loopSum(int[] a, int n) {
//        if (a.length < 1 || n < 1) return 0;
//        int sum = 0;
//        int i = 0;
//        while (i <= n) {
//            for (int j = 0; j < a.length; j++) {
//                if (i < n) {
//                    sum += a[j];
//                }
//                i++;
//            }
//        }
//        return sum;
//    }

    static int loopSum(int[] a, int n) {
        if (a.length < 1 || n < 1) return 0;

        int sum = 0;
        while (n > 0) {
            for (int j = 0; j < a.length && n > 0; j++, n--) {
                sum += a[j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(loopSum(new int[]{1, 2, 3}, 2));
        System.out.println(loopSum(new int[]{-1, 2, -1}, 7));
        System.out.println(loopSum(new int[]{1, 4, 5, 6}, 4));
        System.out.println(loopSum(new int[]{3}, 10));
    }
}
