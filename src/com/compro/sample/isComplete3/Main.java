package com.compro.sample.isComplete3;

public class Main {
    static int isComplete(int[] a) {
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (i == j && a[i] % 2 == 0 && a[i] > max) {
                max = a[i];
                count++;
            } else if (i == j && a[i] % 2 == 0 && a[i] < max) {
                count++;
            }
        }

        return max / 2 == count ? 1 : 0;
    }

    static int IsComplete(int[] a) {
        boolean flag;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                return 0;
            }
            if (a[i] % 2 == 0 && max < a[i]) {
                max = a[i];
            }
        }

        for (int i = 2; i < max; i += 2) {
            flag = false;
            for (int element : a) {
                if (element < 0) {
                    return 0;
                }
                if (element == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
        System.out.println(isComplete(new int[]{6, 3, 3, 2, 2, 2}));
    }
}
