package com.compro.sample.isHodder;

public class Main {
    static int isHodder(int n) {
        if (n < 0 || !isPrime(n)) return 0;
        int i = 1;
        while (i < n) {
            if (twoPower(i) - 1 == n) {
                return 1;
            }
            if (twoPower(i) - 1 > n) {
                break;
            }
            i++;
        }

        return 0;
    }

    static int twoPower(int pow) {
        int result = 1;
        while (pow > 0) {
            result = result * 2;
            pow--;
        }
        return result;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHodder(3));
        System.out.println(isHodder(7));
        System.out.println(isHodder(31));
        System.out.println(isHodder(127));
    }
}
