package com.compro.LegalNumber;

public class Main {
    public static int isLegalNumber(int[] a, int base){
        for (int j : a) {
            if (j >= base) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isLegalNumber(new int[]{3, 7, 1}, 6));
        System.out.println(isLegalNumber(new int[]{3, 2, 1}, 6));
    }
}
