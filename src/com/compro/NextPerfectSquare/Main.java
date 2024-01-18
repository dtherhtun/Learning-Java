package com.compro.NextPerfectSquare;

public class Main {
    public static int NextPerfectSquare(int n){
        if (n < 0) return 0;

        int i = 2;
        while (i * i <= n) {
            i++;
        }
        return  i*i;
    }

    public static int nextPerfectSquare(int n) {
        if(n < 0) return 0;
        int current = (int) Math.floor(Math.sqrt(n));
        current = current + 1;

        return current * current;
    }

    public static void main(String[] args) {
        System.out.println(NextPerfectSquare(1));
        System.out.println(nextPerfectSquare(1));
    }
}
