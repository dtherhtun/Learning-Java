package com.compro.sumFactor;

public class Main {
    public static int sumFactor(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == sum) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(sumFactor(new int[]{1, -1, 1, -1, 1, -1, 1}));
        System.out.println(sumFactor(new int[]{1, 2, 3, 4}));
    }
}
