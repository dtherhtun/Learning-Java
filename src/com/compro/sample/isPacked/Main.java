package com.compro.sample.isPacked;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
//    public static int isPacked(int[] a) {
//        if (a == null) return 0;
//        if (a.length == 0) return 1;
//
//        int compressLength = 1;
//        int prev = a[0];
//        for (int i = 0; i < a.length; i++) {
//            if (prev != a[i]) {
//                compressLength++;
//                prev = a[i];
//            }
//        }
//
//        int[] compress = new int[compressLength];
//        int j = 0;
//        prev = a[0];
//        int count = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (prev != a[i]) {
//                j++;
//                compress[j] = a[i];
//                if (count != prev) {
//                    return 0;
//                }
//                count = 0;
//                prev = a[i];
//            } else {
//                compress[j] = prev;
//            }
//            count++;
//        }
//
//        if (count != a[a.length-1]) {
//            return  0;
//        }
//
//        for (int i = 0; i < compress.length; i++) {
//            for (int k = 0; k < compress.length; k++) {
//                if (i != k) {
//                    if (compress[i] == compress[k]) {
//                        return 0;
//                    }
//                }
//            }
//        }
//        return 1;
//    }

    public static int isPacked(int[] a){
        int j = 0;
        for (int i = 0; i < a.length; i = j) {
            int count = 0;
            System.out.println("begin -> i + j "+ i + " "+ j);

            for (j = i; j < i + a[i]; j++) {
                System.out.println("a[i] -> "+a[i]+" i "+i +" a[j] "+a[j]+" j "+j);
                if (a[i] != a[j]){
                    return 0;
                }
            }
            for (int k = 0; k < a.length; k++) {
                System.out.println("a[i] -> "+a[i]+" i "+i +" a[k] "+a[k]+" k "+k+" count "+count);
                if (a[k] == a[i]) {
                    count++;
                }
            }
            System.out.println("a[i] "+ a[i] + " i "+ i + " j "+ j);
            if (count > a[i]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isPacked(new int[]{2, 2, 1}));
        System.out.println(isPacked(new int[]{2, 2, 1, 2, 2}));
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 1}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7}));
        System.out.println(isPacked(new int[]{}));
        System.out.println(isPacked(new int[]{1, 2, 1}));
        System.out.println(isPacked(new int[]{2, 1, 1}));
        System.out.println(isPacked(new int[]{-3, -3, -3}));
        System.out.println(isPacked(new int[]{0, 2, 2}));
        System.out.println(isPacked(new int[]{2, 1, 2}));
    }
}
