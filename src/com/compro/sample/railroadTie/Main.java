package com.compro.sample.railroadTie;

public class Main {
    public static int isRailroadTie(int[] a) {
        if ((a.length < 2 || a[0] == 0 || a[a.length-1] == 0) ||
                ((a.length - 5) % 3 != 0 && a.length != 2)) return 0;

        for (int i = 2; i < a.length; i = i+3) {
           if (a[i-1] == 0 || a[i-2] == 0 || a[i+1] == 0 || a[i+2] == 0 || a[i] != 0) {
               return 0;
           }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isRailroadTie(new int[]{1, 2}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));
        System.out.println(isRailroadTie(new int[]{3, -3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));
        System.out.println(isRailroadTie(new int[]{0, 0, 0, 0}));
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isRailroadTie(new int[]{1, 3, 0, 3, 5, 0}));
    }
}
