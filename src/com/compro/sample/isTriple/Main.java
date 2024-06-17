package com.compro.sample.isTriple;

public class Main {
    static int isTriple(int[] a) {
        if (a.length < 3) return 0;

        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (i == j) {
                int count = 0;
                for (int k = i; k < a.length; k++) {
                    if (a[i] == a[k]) {
                        count++;
                    }
                }
                if (count != 3) {
                    return 0;
                }
            }
        }

        return 1;
    }

//    static int isTriple(int[] a) {
//        if (a.length < 3) return 0;
//        int count = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if (a[i] == a[j]) {
//                    count++;
//                }
//            }
//            if (count != 3) {
//                return 0;
//            }
//            count = 0;
//        }
//        return 1;
//    }

    public static void main(String[] args) {
        System.out.println(isTriple(new int[]{3, 1, 2, 1, 3, 1, 3, 2, 2}));
        System.out.println(isTriple(new int[]{2, 5, 2, 5, 5, 2, 5}));
        System.out.println(isTriple(new int[]{3, 1, 1, 1}));
    }
}
