package com.compro.inertialArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int isInertial(int[] arr) {

        if(arr.length < 3 ) return 0;

        ArrayList<Integer> oddArr = new ArrayList<>();
        ArrayList<Integer> evenArr = new ArrayList<>();
        int maxOdd = 0;
        int maxEven = 0;

        for (int j : arr) {
            if (j % 2 != 0) {
                oddArr.add(j);
                if (j > maxOdd) {
                    maxOdd = j;
                }
            } else {
                evenArr.add(j);
                if (j > maxEven) {
                    maxEven = j;
                }
            }
        }

        if (oddArr.isEmpty() || maxOdd > maxEven) return 0;

        for (Integer odd : oddArr) {
            for (Integer even : evenArr) {
                if (even != maxEven) {
                    if (even > odd) {
                        return 0;
                    }
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{11, 4, 20, 9, 2, 8}));
        System.out.println(isInertial(new int[]{12, 11, 4, 9, 2, 3, 10}));
    }
}
