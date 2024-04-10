package com.compro.isSequentiallyBounded;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int isSequentiallyBounded(int[] a) {
        int min = a[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {

            if (min > a[i]) {
                return 0;
            }
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+1);
            } else {
                map.put(a[i], 1);
            }
            min = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            if (map.get(a[i]) >= a[i]){
                return 0;
            }
        }

        return 1;
    }

    public static  int isSequentiallyBoundedGod(int[ ] a) {
        int min = a[0];
        for(int i = 0 ; i < a.length; i++) {
            if(a[i] < min) {
                return 0;
            }
            min = a[i];
            int count = 0;
            for(int j = 0; j < a.length; j++) {
                if(a[j] == a[i]) {
                    count++;
                }
            }
            if(count >= a[i]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
//        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));
//        System.out.println(isSequentiallyBounded(new int[]{1, 2, 3}));
//        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3}));
//        System.out.println(isSequentiallyBounded(new int[]{12, 12, 9}));
//        System.out.println(isSequentiallyBoundedGod(new int[]{2, 3, 3 , 99, 99, 99, 99, 99}));
//        System.out.println(isSequentiallyBoundedGod(new int[]{1, 2, 3}));
//        System.out.println(isSequentiallyBoundedGod(new int[]{2, 3, 3, 3, 3}));
//        System.out.println(isSequentiallyBoundedGod(new int[]{12, 12, 9}));
        System.out.println(isSequentiallyBoundedGod(new int[]{0, 1}));
        System.out.println(isSequentiallyBoundedGod(new int[]{-1, 2}));
//        System.out.println(isSequentiallyBoundedGod(new int[]{}));
        System.out.println(isSequentiallyBoundedGod(new int[]{5, 5, 5, 5}));
        System.out.println(isSequentiallyBoundedGod(new int[]{5, 5, 5, 2, 5}));
        System.out.println(isSequentiallyBoundedGod(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));
        System.out.println(isSequentiallyBoundedGod(new int[]{1, 2, 3}));
        System.out.println(isSequentiallyBoundedGod(new int[]{2, 3, 3}));
        System.out.println(isSequentiallyBoundedGod(new int[]{2, 3, 3, 3, 3}));
        System.out.println(isSequentiallyBoundedGod(new int[]{2, 3, 3, 3, 3, 1}));
    }
}
//0
//        0
//        1
//        1
//        0
//        1
//        0
//        1
//        0
//        0
