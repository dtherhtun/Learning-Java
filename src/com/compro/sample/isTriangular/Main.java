package com.compro.sample.isTriangular;

public class Main {
    static int isTriangular(int n) {
        int i = 1;
        int sum = 0;
        while (sum < n) {
            sum += i;
            i++;
        }


        return sum == n ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isTriangular(15));
    }
}
