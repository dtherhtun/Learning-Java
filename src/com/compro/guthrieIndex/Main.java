package com.compro.guthrieIndex;

public class Main {
    public static int guthrieIndex(int n) {
        if (n < 1) return 0;
        int count = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            count++;
        }
        return count-1;
    }
    public static void main(String[] args) {
        System.out.println(guthrieIndex(10));
    }
}
