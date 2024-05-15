package com.compro.sample.isConsecutiveFactored;

public class Main {
//    static int isConsecutiveFactored(int n) {
//        int i = 2;
//        boolean flag = false;
//        int prev = 0;
//        while (i <= n) {
//            while (isPrime(i) && n % i == 0) {
//                if (!flag && i == prev + 1) {
//                    flag = true;
//                }
//                n /= i;
//                prev = i;
//            }
//            i++;
//        }
//        return flag ? 1 : 0;
//    }

    static int isConsecutiveFactored(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0 && n % (i + 1) == 0) {
                return 1;
            }
        }
        return 0;
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
        System.out.println(isConsecutiveFactored(24));
        System.out.println(isConsecutiveFactored(105));
        System.out.println(isConsecutiveFactored(90));
        System.out.println(isConsecutiveFactored(23));
        System.out.println(isConsecutiveFactored(15));
        System.out.println(isConsecutiveFactored(2));
        System.out.println(isConsecutiveFactored(0));
        System.out.println(isConsecutiveFactored(-12));
    }
}
