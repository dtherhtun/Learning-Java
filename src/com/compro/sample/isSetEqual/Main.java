package com.compro.sample.isSetEqual;

public class Main {
    static int isSetEqual(int[] a, int[] b) {

        int aUnique = countUnique(a);
        int bUnique = countUnique(b);
        if (aUnique != bUnique) return 0;

        for (int i = 0; i < a.length; i++) {
            boolean contain = true;
            for (int j = 0; j < b.length; j++) {
                contain = false;
                if (a[i] == b[j]) {
                    contain = true;
                    break;
                }
            }
            if (!contain) {
                return 0;
            }
        }
//        for (int i = 0; i < b.length; i++) { // vice-versa way
//            boolean contain = true;
//            for (int j = 0; j < a.length; j++) {
//                contain = false;
//                if (b[i] == a[j]) {
//                    contain = true;
//                    break;
//                }
//            }
//            if (!contain) {
//                return 0;
//            }
//        }
        return 1;
    }

    static int countUnique(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (j == i) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isSetEqual(new int[]{1, 9, 12}, new int[]{1, 9, 12, 9, 12, 1, 9}));
        System.out.println(isSetEqual(new int[]{1, 7, 8}, new int[]{1, 7, 1}));
        System.out.println(isSetEqual(new int[]{1, 9, 12}, new int[]{1, 7, 6}));
    }
}
