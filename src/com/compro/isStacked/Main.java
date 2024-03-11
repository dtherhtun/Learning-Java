package com.compro.isStacked;

public class Main {
    public static int isStacked(int n) {
        int i = 0;
        int total = 0;
        while (i <= n) {
            total += i;
            if (n == total){
                return 1;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isStacked(15));
        System.out.println(isStacked(7));
    }
}
