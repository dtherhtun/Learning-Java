package com.compro.divisable;

public class Main {
    public static int isDivisible(int[] a,int divisor){
        for (int j : a) {
            if (j % divisor != 0) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(new int[]{2, 2, 3, 2}, 2));
    }
}
