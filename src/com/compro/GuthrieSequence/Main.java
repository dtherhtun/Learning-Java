package com.compro.GuthrieSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int isGuthrieSequence(int[ ] arr) {
        int n = arr[0];
        ArrayList<Integer> GuthrieSeq = new ArrayList<>();
        while (n != 1) {
            GuthrieSeq.add(n);
            if (n % 2 == 0 ) {
                n = n/2;
            } else {
                n = (n * 3) + 1;
            }
        }

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != GuthrieSeq.get(i)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[]{7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1}));
    }
}
