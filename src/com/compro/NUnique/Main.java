package com.compro.NUnique;

public class Main {
    public static int isNUnique(int[] a, int n){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] + a[j] == n) {
                    count++;
                }
            }
        }
        return count == 1 ? 1 : 0 ;
    }

    public static void main(String[] args) {
        System.out.println(isNUnique(new int[]{2, 7, 3, 4}, 5));
        System.out.println(isNUnique(new int[]{2, 3, 3, 7}, 5));
    }
}
