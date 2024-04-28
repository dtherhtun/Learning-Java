package com.projecteuler.problem2;

public class Main {
    static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int a = 0, b = 1;
        int temp = 0;
        while (b <= limit) {
            if (b % 2 == 0) {
                sum += b;
            }
            temp = a;
            a = b;
            b = temp + a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenFibonacci(4000000));
    }
}
