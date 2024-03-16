package com.compro.isTrivalent;

import java.util.HashSet;

public class Main {
    public static int isTrivalent(int[] a) {
        if (a.length < 3) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : a){
            set.add(i);
        }
        if (set.size() != 3) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println(isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));
        System.out.println(isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
    }
}
