package com.compro.repsEqual;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int repsEqual(int[] a, int n) {
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = n % 10;
            n = n/10;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[b.length-1-i]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3}, 32053));
    }
}
