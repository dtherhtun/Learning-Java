package com.compro.sample.vanilla;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static int isVanilla(int[] a){
        if (a.length < 2) return 1;
        int temp = a[0]%10;
        for (int i = 0; i < a.length; i++) {
            int value = 0;
            if (a[i] < 0) {
                value = a[i] * -1;
            } else {
                value = a[i];
            }

            while (value != 0) {
                if (value%10 != temp) {
                    return 0;
                }
                value = value / 10;
            }
        }
        return 1;
    }
// do not use string, don't event think about string
//    public static int isVanillaString(int[] a){
//        Instant startTime = Instant.now();
//        if (a.length < 2) return 1;
//        String temp = String.valueOf(a[0]%10);
//        for (int i = 0; i < a.length; i++) {
//            String value = "";
//            if (a[i] < 0) {
//                value = String.valueOf(a[i] * -1);
//            } else {
//                value = String.valueOf(a[i]);
//            }
////            System.out.println(value);
////            if (!value.contains(temp)) { // this can lead to wrong when contain non-other value
////                return 0;
////            }
//            for (int j = 0; j < value.length(); j++) {
//                if (temp.equals(value.charAt(j))) {
//                    return 0;
//                }
//            }
//        }
//        Instant stopTime = Instant.now();
//        System.out.println(Duration.between(startTime, stopTime).toNanos());
//        return 1;
//    }

    public static void main(String[] args) {
        System.out.println(isVanilla(new int[]{1}));
        System.out.println(isVanilla(new int[]{11, 22, 13, 34, 125}));
        System.out.println(isVanilla(new int[]{9, 999, 99999, -9999}));
        System.out.println(isVanilla(new int[]{}));
//        System.out.println(isVanillaString(new int[]{1}));
//        System.out.println(isVanillaString(new int[]{11, 22, 13, 34, 125}));
//        System.out.println(isVanillaString(new int[]{9, 999, 99999, -9999}));
//        System.out.println(isVanillaString(new int[]{}));
//        System.out.println(isVanilla(new int[]{11, 101, 1111, 11111}));
//        System.out.println("---------------------");
//        System.out.println(isVanillaString(new int[]{11, 101, 1111, 11111}));
    }
}
