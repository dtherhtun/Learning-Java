package com.compro.sample.checkConcatenatedSum;

public class Main {
    public static int checkConcatenatedSum(int n, int catLen) {
        if (n < 0 || catLen < 0) return 0;
        int concat = 0;
        for (int i = 0; i < catLen; i++) {
            concat *= 10;
            concat += 1;
        }
        int sum = 0;
        int i = n;
        while (i > 0) {
            sum += i % 10 * concat;
            i = i / 10;
        }
        return n == sum ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(9, 1));
    }
}
