package com.compro.sample.trivalent;

import java.util.HashSet;

public class Main {
    public static int isTrivalent(int[] a){
        if (a.length < 3) return 0;
        HashSet<Integer> count = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            count.add(a[i]);
        }

        return count.size() >= 3 ? 1 : 0;
    }


    public static void main(String[] args) {
        System.out.println(isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int[]{1, 2, 1, 2, 1, 2, 2}));
        System.out.println(isTrivalent(new int[]{ 2147483647, -1, -1, -2147483648}));
    }
}
