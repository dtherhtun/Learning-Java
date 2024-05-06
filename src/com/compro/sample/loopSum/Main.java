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

//    static int loopSum(int[] a, int n) {
//        int sum = 0;
//
//        for (int i = 0, index = 0; i < a.length && index < n; i++, index++) {
//            sum += a[i];
//            if (i == a.length - 1 && index != n - 1)
//                i = -1;
//        }
//        return sum;
//    }

    public static void main(String[] args) {
        System.out.println(loopSum(new int[]{1, 2, 3}, 2));
        System.out.println(loopSum(new int[]{-1, 2, -1}, 7));
        System.out.println(loopSum(new int[]{1, 4, 5, 6}, 4));
        System.out.println(loopSum(new int[]{3}, 10));
    }
}
