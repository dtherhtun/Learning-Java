package com.compro.sample.MadhavArray;

import javax.sound.midi.Soundbank;

public class Main {
    public static int isMadhavArray(int[ ] a){
        if (a.length < 3) return 0;
        int i = 1;
        boolean isCorrectLength = false;
        while (i*(i+1) <= a.length * 2){
            if (a.length * 2 == i*(i+1)) {
                isCorrectLength = true;
                break;
            } else {
                i++;
            }

        }

        if (!isCorrectLength) {
            return 0;
        }

        int index = 0;
        for (int j = 1; j <= i ; j++) {
            int sum = 0;
            for (int k = 0; k < j; k++) {
                sum = sum + a[index];
                index++;
            }
            if (sum != a[0]){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, - 1}));
        System.out.println(isMadhavArray(new int[]{3, 1, 2, 3, 0}));
    }
}
