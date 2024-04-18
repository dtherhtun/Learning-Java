package com.compro.sample.perfectNumber;

public class Main {
    public static boolean isPerfectN(int n) {
        if (n < 1 && n % 2 != 0) return false;
        int start = 1;
        int end = n / 2;
        int sum = 0;

        while (start <= end) {
            if (n % start == 0) {
                sum += start;
            }
            start++;
        }
        return sum == n;
    }

    public static int PerfectTime(int n) {
        if (n < 1) return 0;
        int count = 0;
        int result = 0;
        while (count != n) {
            result++;
            if (isPerfectN(result)) {
                count++;
            }
        }
        return result;
    }

    public static int henry(int a, int b) {
        return PerfectTime(a) + PerfectTime(b);
    }

    public static void main(String[] args) {
        System.out.println(henry(0, 1));
    }
}
