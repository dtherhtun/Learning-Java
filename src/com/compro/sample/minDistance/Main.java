package com.compro.sample.minDistance;

public class Main {
    static int minDistance(int n) {
        int prev = 1;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && i - prev < minDistance) {
                minDistance = i - prev;
                prev = i;
            }
        }
        return minDistance;
    }

    public static void main(String[] args) {
        System.out.println(minDistance(13013));
        System.out.println(minDistance(8));
    }
}
