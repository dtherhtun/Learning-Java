package com.compro.matches;

public class Main {
    public static int matches(int[] a, int[] p){
        int i = 0;

        for (int j = 0; j < p.length; j++) {
            if (p[j] < 0 ){
                int g = p[j] * -1;
                for (int k = 0; k < g; k++) {
                    if (a[i+k] > 0) {
                        return 0;
                    }
                }
                i += g;
            } else { // positive case
                for (int k = 0; k < p[j]; k++) {
                    // check element is whether negative or positive
                    if (a[i + k] < 0) {
                        return 0;
                    }
                }
                i += p[j];
            }
        }
        return 1;
    }

    public static int matchesGod(int[] a, int[] p){
        int index = 0;
        int len = 0;
        for (int j : p) {
            len = len + Math.abs(j);
        }

        if (len != a.length) {
            return 0;
        }

        for (int i = 0; i < p.length; i++) {
            for (int j = index; j < Math.abs(p[i])+index; j++) {
                if ((p[i] > 0 && a[j] <= 0) || (p[i] < 0 && a[j] > 0)) {
                    return 0;
                }
            }
            index = index + Math.abs(p[i]);
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(matches(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{3, -2, 3}));
        System.out.println(matches(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{2, 1, -1, -1, 2, 1}));
        System.out.println(matches(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{1, 2, -1, -1, 1, 2}));
        System.out.println(matches(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{2, 1, -2, 3}));
        System.out.println(matches(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{1, 1, 1, -1, -1, 1, 1, 1}));


        System.out.println(matches(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{4, -1, 3}));
        System.out.println(matches(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{2, -3, 3}));
        System.out.println("---------------------------");

        System.out.println(matchesGod(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{3, -2, 3}));
        System.out.println(matchesGod(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{2, 1, -1, -1, 2, 1}));
        System.out.println(matchesGod(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{1, 2, -1, -1, 1, 2}));
        System.out.println(matchesGod(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{2, 1, -2, 3}));
        System.out.println(matchesGod(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{1, 1, 1, -1, -1, 1, 1, 1}));


        System.out.println(matchesGod(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{4, -1, 3}));
        System.out.println(matchesGod(new int[]{1,  2,  3, -5, -5,  2, 3, 18}, new int[]{2, -3, 3}));
    }
}
