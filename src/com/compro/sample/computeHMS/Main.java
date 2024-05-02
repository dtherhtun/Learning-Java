package com.compro.sample.computeHMS;

import java.util.Arrays;

public class Main {
    static int[] computeHMS(int n) {
        int[] hms = new int[3];


        hms[0] = n / 3600;
        n = n % 3600;

        hms[1] = n / 60;
        n = n % 60;

        hms[2] = n;

        return hms;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS(0)));
        System.out.println(Arrays.toString(computeHMS(40271)));
    }
}
