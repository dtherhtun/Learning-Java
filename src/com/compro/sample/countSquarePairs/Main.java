package com.compro.sample.countSquarePairs;

public class Main {
    public static int isPerfectSquare(int n){
        if (n < 1) return 0;
        int i = 1;
        while (i * i < n){
            i++;
        }
        return i * i == n ? 1 : 0;
    }
    public static int countSquarePairs(int[] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
               if (i != j && a[i] > 0 && a[j] > 0 && a[i] < a[j]) {
                   if (1 == isPerfectSquare(a[i]+ a[j])) {
                       count++;
                   }
               }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSquarePairs(new int[]{9, 0, 2, -5, 7}));
        System.out.println(countSquarePairs(new int[]{9}));
        System.out.println(countSquarePairs(new int[]{4, 5}));
    }
}
