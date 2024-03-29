package com.compro.sample.repsEqual;

public class Main {
    public static int power(int base, int pow) {
        int result = 1;
        while (pow != 0){
            result = result * base;
            pow--;
        }
        return result;
    }

    public static int repsEqual(int[] a, int n){
        int result = 0;
        for (int i = a.length-1; i >= 0; i--) {
            result += a[a.length-i-1] * power(10, i);
        }

        return result == n ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3, 4}, 32053));
        System.out.println(repsEqual(new int[]{9, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{0,3, 2, 0, 5, 3}, 32053));
    }
}
