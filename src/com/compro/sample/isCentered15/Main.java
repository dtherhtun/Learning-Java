package com.compro.sample.isCentered15;

public class Main {
    public static int isCentered15(int[] a) {
        if (a.length < 3) {
            return 0;
        }
        if (a.length % 2 == 0) {
            if (a[(a.length / 2) - 1] + a[a.length / 2] == 15) {
                return 1;
            }
        } else {
            if (a[a.length / 2] == 15 || a[(a.length / 2) - 1] + a[a.length / 2] + a[(a.length / 2) + 1] == 15) {
                return 1;
            }
        }
        return 0;
    }

    public static int isCentered15Unlimited(int[] a) {
        if (a.length < 3) return 0;
        int temp = a.length / 2;
        int sum = a[a.length / 2];
        int evenSum = sum + a[a.length / 2 - 1];
        int j = 0;
        while (temp > 1) {
            if (a.length % 2 == 0) {
                if ((a.length / 2 - j - 2) == 0) {
                    break;
                }
                if (evenSum != 15) {
                    evenSum += a[a.length - temp + 1] + a[(a.length / 2) - j - 2];
                } else {
                    break;
                }
            } else {
                if (sum != 15) {
                    sum += a[(a.length / 2) - j - 1] + a[a.length - temp];
                } else {
                    break;
                }
            }
            j++;
            temp--;
        }
        if (evenSum == 15 || sum == 15) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
//        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
//        System.out.println(isCentered15(new int[]{2, 10, 4, 1, 6, 9}));
//        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6}));
//        System.out.println(isCentered15(new int[]{1, 1, 8, 3, 1, 1}));
//        System.out.println(isCentered15(new int[]{9, 15, 6}));
//        System.out.println(isCentered15(new int[]{1, 1, 2, 2, 1, 1}));
//        System.out.println(isCentered15(new int[]{1, 1, 15 -1,-1}));
//        System.out.println(isCentered15(new int[]{2, 14, 10, 5, 6, 9}));
//        System.out.println(isCentered15Unlimited(new int[]{3, 1, 6, 4, 1, 2, 1, 6}));
//        System.out.println(isCentered15Unlimited(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}));
//        System.out.println(isCentered15Unlimited(new int[]{3, 2, 10, 4, 1, 6, 9}));
//        System.out.println(isCentered15Unlimited(new int[]{2, 10, 4, 1, 6, 9}));
//        System.out.println(isCentered15Unlimited(new int[]{3, 2, 10, 4, 1, 6}));
//        System.out.println(isCentered15Unlimited(new int[]{1, 1, 8, 3, 1, 1}));
//        System.out.println(isCentered15Unlimited(new int[]{9, 15, 6}));
//        System.out.println(isCentered15Unlimited(new int[]{1, 1, 2, 2, 1, 1}));
//        System.out.println(isCentered15Unlimited(new int[]{1, 1, 15 -1,-1}));
//        System.out.println(isCentered15Unlimited(new int[]{1, 2, 5, 4, 1, 2, 1, 0}));
        System.out.println(isCentered15Unlimited(new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}));
    }
}
