package com.compro.primeCount;

public class Main {

//    public static boolean isPrime(int n) {
//        if ( n < 4 && n > 1) return true;
//        if ( n == 4 ) return false;
//        int countFactor = 0;
//        for (int i = 1; i < n/2; i++) {
//            if (n % i == 0) {
//                countFactor++;
//            }
//        }
//        return countFactor == 1;
//    }

    static  boolean isPrime(int num) {
        if(num<=1) return false;

        for(int i=2;i <= num/2;i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int primeCount(int start, int end) {
        int primeCount = 0;

        while (start < end) {
            if (isPrime(start)) {
                primeCount++;
            }
            start++;
        }
        return primeCount;
    }

    public static void main(String[] args) {
//        System.out.println(primeCount(0, 100));
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11, 29));
        System.out.println(primeCount(20, 22));
        System.out.println(primeCount(1, 1));
        System.out.println(primeCount(5, 5));
        System.out.println(primeCount(6, 2));
        System.out.println(primeCount(-10, 6));
    }
}
