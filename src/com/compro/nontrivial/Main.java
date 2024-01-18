package com.compro.nontrivial;

public class Main {
    public static int maxDistance(int number) {
        if(number <= 1) return -1;
        
        int max = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                if (i > max) {
                    max = i;
                }
                if (i < min) {
                    min = i;
                }
            }
        }

        if (max == -1 || min == Integer.MAX_VALUE) return -1;

        return max - min;
    }

    public static void main(String[] args) {
        System.out.println(maxDistance(49));
        System.out.println(maxDistance(12));
        System.out.println(maxDistance(13));
    }
}
