package com.compro.sample.isDigitIncreasing;

public class Main {
//    static int isDigitIncreasing(int n) {
//        if (n < 1) return 0;
//
//        int i = 1;
//        int sum = 0;
//        int k = 0;
//        int total = 0;
//
//        while (i < 10) {
//            k = n;
//            sum = 0;
//            int j = 0;
//            while (k > 0) {
//                sum += power(j) * i;
//                j++;
//                k = k / 10;
//            }
//            total = sum;
//
//            while (sum > 0) {
//                total += sum / 10;
//                sum = sum / 10;
//            }
//            if (total == n) {
//                return 1;
//            }
//            i++;
//        }
//
//        return 0;
//    }

    static int power(int pow) {
        int result = 1;
        while (pow > 0) {
            result = result * 10;
            pow--;
        }
        return result;
    }

    static int isDigitIncreasing(int n) {

        for (int i = 1; i <= 9; i++) {
            int total = 0;
            int product = 0;

            while (total < n) {
                product = (product * 10) + i;
                total += product;
            }

            if (total == n) {
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
//        System.out.println(isDigitIncreasing(7));
//        System.out.println(isDigitIncreasing(36));
//        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
    }
}
