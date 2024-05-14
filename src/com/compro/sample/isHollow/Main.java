package com.compro.sample.isHollow;

public class Main {
    static int isHollow(int[] a) {
        if (a.length < 3) return 0;
        int count = 0;
        int start;
        int end = 0;
        for (start = 0; start < a.length; start++) {
            if (a[start] == 0) {
                end = start;
                while (a[end] == 0) {
                    count++;
                    end++;
                    if (end == a.length) { // prevent out of index
                        break;
                    }
                }
                break;
            }
        }

        return a.length - end == start && count > 2 ? 1 : 0;
    }

    public static int isHollowOld(int[] arr) {
        int zeroCount = 0;
        int left = 0;
        int right = arr.length - 1;
        if (arr.length < 3) return 0;

        while (left < right) {
            if (arr[left] != 0 && arr[right] != 0) {
                left++;
                right--;
            } else {
                break;
            }
        }

        for (int i = left; i <= right; i++) {
            if (arr[i] != 0) return 0;
            zeroCount++;
        }

        if (zeroCount < 3 || arr.length - 1 - left != right) return 0;
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5}));
        System.out.println(isHollow(new int[]{3, 8, 3, 0, 0, 0, 3, 3}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 0}));
        System.out.println(isHollow(new int[]{0, 1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{0, 0, 0}));
        System.out.println(isHollow(new int[]{1, 0, 2, 3, 0, 0, 0, 3, 4, 0, 5}));
    }
}
