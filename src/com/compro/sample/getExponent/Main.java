package com.compro.sample.getExponent;

public class Main {
    //    public static int getExponent(int n, int p) {
//        if (p <= 1) return -1;
//        int result = 1;
//        int count = 0;
//        if (n < 0) {
//            n = n * -1;
//        }
//        while (n > result) {
//            result = result * p;
//            if (n >= result) {
//                count++;
//            }
//        }
//
//        if (n%(result/p) == 0) {
//            return count;
//        }
//
//        if (n%p == 0){
//            return 1;
//        }
//
//        return 0;
//    }
    public static int getExponent(int n, int p) {
        if (p <= 1) return -1;

        int count = 0;

        n = n > 0 ? n : -n;

        for (int i = n; i > 0; i /= p) {
            if (i % p == 0) {
                count++;
            } else {
                break;
            }
        }
//        while (n > 0) {
//            if (n % p == 0)
//                count++;
//            else break;
//
//            n /= p;
//        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(getExponent(162, 3));
        System.out.println(getExponent(27, 3));
        System.out.println(getExponent(28, 3));
        System.out.println(getExponent(280, 7));
        System.out.println(getExponent(-250, 5));
        System.out.println(getExponent(18, 1));
        System.out.println(getExponent(128, 4));
    }
}
