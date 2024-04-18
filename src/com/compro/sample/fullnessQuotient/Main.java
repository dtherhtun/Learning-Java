package com.compro.sample.fullnessQuotient;

public class Main {
    public static int fullnessQuotient(int n) {
        if (n < 1) return -1;
        int count = 0;
        for (int i = 2; i <= 9 ; i++) {
            if (isContainZeroInBase(n, i) != 0) {
                count++;
            }
        }
        return count;
    }

    public static int isContainZeroInBase(int n, int base) {
        while (n > 0) {
            if (n % base == 0) {
                return 0;
            }
            n = n / base;
        }
        return 1;
    }

//    public static int base(int n, int base){
//        StringBuilder result = new StringBuilder();
//        while (n > 0) {
//            if (n%base == 0) {
//                return 0;
//            }
//            result.append(n%base) ;
//            n = n/base;
//        }
//
//        return Integer.parseInt(result.reverse().toString());
//    }

    public static void main(String[] args) {
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(9));
        System.out.println(fullnessQuotient(360));
        System.out.println(fullnessQuotient(-1));
        System.out.println(fullnessQuotient(94));
    }
}
