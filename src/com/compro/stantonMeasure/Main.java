package com.compro.stantonMeasure;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int stantonMeasure(int[] arr) {
        int oneCount = 0;
        int nextCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                oneCount++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (oneCount < 1) {
                return 0;
            }
            if (arr[i] == oneCount) {
                nextCount++;
            }
        }
        return nextCount;
    }

    public static int stantonMeasureMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

//            Integer ok = map.get(arr[i]);
//
//            if (ok == null)
//                map.put(arr[i], 1);
//            else {
//                map.put(arr[i], ok + 1);
//            }

            map.merge(arr[i], 1, Integer::sum);
        }


        return map.get(map.get(1));
    }

    public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[]{1, 4, 0, 2, 1, 2, 3, 2}));
        System.out.println(stantonMeasure(new int[]{0, 0, 0, 0,}));
        System.out.println(stantonMeasureMap(new int[]{1, 4, 3, 2, 1, 2, 3, 2}));
    }
}
