package com.compro.sample.encodeArray;

import java.util.Arrays;

public class Main {
    static int[] encodeArray(int n) {

        boolean isNegative = n < 0;
        int size = isNegative ? 1 : 0;

        int k = isNegative ? -n : n;

        do {
            if (k == 0) {
                size = 1;
            } else {
                size = ++size + k % 10;
                k = k / 10;
            }
        } while (k > 0);


        int[] result = new int[size];
        result[0] = isNegative ? -1 : 1;

        int j = isNegative ? 1 : 0;
        k = isNegative ? -n : n;
        
        while (k > 0) {

            int i = k % 10;
            while (i > 0) {
                result[j] = 0;
                i--;
                j++;
            }
            result[j] = 1;
            j++;
            k = k / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeArray(0)));
        System.out.println(Arrays.toString(encodeArray(1)));
        System.out.println(Arrays.toString(encodeArray(-1)));
        System.out.println(Arrays.toString(encodeArray(100001)));
        System.out.println(Arrays.toString(encodeArray(999)));
        System.out.println(Arrays.toString(encodeArray(-511)));
    }
}
