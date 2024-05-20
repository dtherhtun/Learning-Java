package com.compro.sample.isFilter;

public class Main {
    static int isFilter(int[] a) {
        boolean isContainNine = false;
        boolean isContainSeven = false;
        boolean isContainEleven = false;
        boolean isContainThirteen = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                isContainNine = true;
            }
            if (a[i] == 7) {
                isContainSeven = true;
            }
            if (a[i] == 11) {
                isContainEleven = true;
            }
            if (a[i] == 13) {
                isContainThirteen = true;
            }
        }
        return isContainNine && isContainEleven || isContainSeven && !isContainThirteen || !isContainSeven && isContainThirteen ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isFilter(new int[]{1, 2, 3, 9, 6, 11}));
        System.out.println(isFilter(new int[]{3, 4, 6, 7, 14, 16}));
        System.out.println(isFilter(new int[]{1, 2, 3, 4, 10, 11, 13}));
        System.out.println(isFilter(new int[]{3, 6, 5, 5, 13, 6, 13}));
        System.out.println(isFilter(new int[]{9, 6, 18}));
        System.out.println(isFilter(new int[]{4, 7, 13}));
    }
}
