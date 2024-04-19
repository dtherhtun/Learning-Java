package com.compro.sample.encodeNumber;

import java.util.Arrays;

public class Main {
    static int[] encodeNumber(int n) {
        if (n <= 1) return null;
        int i = 0;
        int k = n;
        int size = 0;
        while (i <= n) {
            while (isPrime(i) && k % i == 0) {
                size++;
                k = k / i;
                System.out.println(k + " " + i);
            }
            i++;
        }
        int[] result = new int[size];
        i = 0;
        k = n;
        int j = 0;
        while (i <= n) {
            while (isPrime(i) && k % i == 0) {
                k = k / i;
                result[j] = i;
                j++;
            }
            i++;
        }
        return result;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeNumber(6936)));
//        System.out.println(Arrays.toString(encodeNumber(2)));
//        System.out.println(Arrays.toString(encodeNumber(6)));
//        System.out.println(Arrays.toString(encodeNumber(14)));
//        System.out.println(Arrays.toString(encodeNumber(24)));
//        System.out.println(Arrays.toString(encodeNumber(1200)));
//        System.out.println(Arrays.toString(encodeNumber(1)));
//        System.out.println(Arrays.toString(encodeNumber(-18)));
    }
}
