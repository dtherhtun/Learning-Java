package com.compro.sample.isSmart;

public class Main {
    static int isSmart(int n) {
        int i = 1;
        int sum = 1;
        while (i <= n) {
            if (sum == n) {
                return 1;
            } else if (sum > n) {
                break;
            }
            sum += i;
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isSmart(11));
        System.out.println(isSmart(22));
        System.out.println(isSmart(2));
        System.out.println(isSmart(8));
    }
}
