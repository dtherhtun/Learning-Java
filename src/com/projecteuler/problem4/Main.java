package com.projecteuler.problem4;

public class Main {
    static int[] digitGenerator(int n) {
        int[] result = new int[2];
        if (n < 1) return result;
        int min = 1;
        int max = 0;
        while (n > 0) {
            min = min * 10;
            max = max * 10 + 9;
            n--;
        }
        result[0] = min / 10;
        result[1] = max;

        return result;
    }

    static boolean isPalindromicNumber(int n) {
        int original = n;
        int reverse = 0;
        int lastdigit = 0;
        while (n > 0) {
            lastdigit = n % 10;
            reverse = reverse * 10 + lastdigit;
            n /= 10;
        }
        return original == reverse;
    }

    static int largestPalindromicNumber(int digit) {
        int[] minMaxDigit = digitGenerator(digit);
        int maxPalindromic = 0;
        int product = 0;

        for (int i = minMaxDigit[1]; i >= minMaxDigit[0]; i--) {
            for (int j = i; j >= minMaxDigit[0]; j--) {
                product = i * j;
                if (product <= maxPalindromic) {
                    break;
                }
                if (isPalindromicNumber(product)) {
                    maxPalindromic = product;
                }
            }
        }

        return maxPalindromic;
    }

    public static void main(String[] args) {
        System.out.println(largestPalindromicNumber(3));
    }
}
