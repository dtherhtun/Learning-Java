package com.compro.isRailroadTie;

public class Main {
    public static int isRailroadTie(int[] a){
        if (a.length < 5 || (a.length-5) % 3 != 0 || a[0] == 0 || a[a.length-1] == 0) {
            return 0;
        }
        int j = 2;
        for (int i = 0; i <= (a.length-5)/3; i++) {
            if (a[j] != 0 || a[j+1] == 0 || a[j-1] == 0 ) {
                return 0;
            }
            j+=3;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 3, -18, 0, 2, 2}));
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 0, 2, 2}));
        System.out.println(isRailroadTie(new int[]{0, 1, 2, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{1, -3, 0, 3, -18, 0, 2, 1, 0, 5, 1}));
        System.out.println(isRailroadTie(new int[]{1, -3, 0, 3, -18}));
    }
}
