package com.compro.sample.findPorcupineNumber;

public class Main {
    public static int isPrime(int n) {
        if (n < 2) return 0;
        if (n == 2) return 1;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return 0;
            }
        }

        return 1;
    }


    public static int findPorcupineNumber(int n) {
        int num = n + 1;
        int next = 0;
        while (true) {
            if (isPrime(num) == 1 && num % 10 == 9) {
                next = num + 1;
                while (1 != isPrime(next)) {
                    next++;
                }
                if (next % 10 == 9) {
                    return num;
                }
            }
            num++;
        }
    }

    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(37));
    }
}
