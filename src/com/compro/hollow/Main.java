package com.compro.hollow;

public class Main {
    public static int isHollow(int[] arr) {
        int zeroCount = 0;
        int left = 0;
        int right = arr.length - 1;
        if (arr.length < 3 || arr[0] == 0 || arr[arr.length-1] == 0) return 0;

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

        if (zeroCount < 3 || arr.length-1 - left != right) return 0;
        return 1;
    }
    public static int isHollowBard(int[] a) {
        if (a.length < 3) {
            return 0; // Not enough elements to be hollow
        }

        int i = 0, j = a.length - 1;

        // Scan from both ends to find the first and last non-zero elements
        while (i < j && a[i] == 0) {
            i++;
        }
        while (i < j && a[j] == 0) {
            j--;
        }

        // Check if all zeros are in the middle and count them
        int zeroCount = 0;
        while (i <= j) {
            if (a[i] != 0 || a[j] != 0) {
                return 0; // Non-zero elements found in the middle
            }
            zeroCount += (i == j) ? 1 : 2; // Count zeros, handling the middle element if odd length
            i++;
            j--;
        }

        return zeroCount >= 3 ? 1 : 0; // Hollow if at least 3 zeros in the middle
    }

    public static int isHollowGPT(int[] arr) {
        // Check if the array is null or has less than 3 elements
        if (arr == null || arr.length < 3) {
            return 0;
        }

        // Find the start and end indices of the zeros in the middle
        int start = 0;
        int end = arr.length - 1;

        while (start < end && arr[start] != 0) {
            start++;
        }

        while (end > start && arr[end] != 0) {
            end--;
        }

        // Check if there are 3 or more zeros in the middle
        int zeroCount = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        // Check if all zeros are in the middle and surrounded by the same number of non-zeros
        if (zeroCount >= 3 && start == end && start > 0 && end < arr.length - 1) {
            int nonZeroCountBefore = start;
            int nonZeroCountAfter = arr.length - 1 - end;

            return (nonZeroCountBefore == nonZeroCountAfter) ? 1 : 0;
        }

        return 0;
    }

    public static boolean middleZero(int[] values) {
        int start = 0;
        int end = 0;
        int zeroCount = 0;
        for(int i=0; i< values.length;i++) {
            if(values[i] == 0) {
                start = i - 1;
                break;        }
        }

        for(int i=values.length-1; i >=0;i--) {
            if(values[i] == 0) {
                end = i + 1;
                break;        }
        }

        for(int k = start + 1; k< end ; k++) {
            if(values[k] == 0) {
                zeroCount = zeroCount +1;
            }
            else {
                return false;
            }
        }

        return (zeroCount >=3 && start + 1 == values.length - end);

    }

    public static void main(String[] args) {
        int[] test1 = {1,2,3,0,0,0,4,3,4};
        int[] test2 = {1,2,3,0,1,0,0,0,4,3,4};
        int[] test3 = {1,2,0,0,0,4,3,4};
        int[] test4 = {1,2,3,0,0,0,3,4};
        int[] test5 = {1,2,3,0,0,4,3,4};
        int[] test6 = {1,2,3,6,0,0,0,0,0,7,4,3,4};
        int[] allZero = {0,0,0,0,0,0,0,0};

        System.out.println(isHollow(test1));
        System.out.println(isHollow(test2));
        System.out.println(isHollow(test3));
        System.out.println(isHollow(test4));
        System.out.println(isHollow(test5));
        System.out.println(isHollow(test6));
        System.out.println(isHollow(allZero));
        System.out.println("---------Bard----------");
        System.out.println(isHollowBard(test1));
        System.out.println(isHollowBard(test2));
        System.out.println(isHollowBard(test3));
        System.out.println(isHollowBard(test4));
        System.out.println(isHollowBard(test5));
        System.out.println(isHollowBard(test6));
        System.out.println(isHollowBard(allZero));
        System.out.println("----------GPT---------");
        System.out.println(isHollowGPT(test1));
        System.out.println(isHollowGPT(test2));
        System.out.println(isHollowGPT(test3));
        System.out.println(isHollowGPT(test4));
        System.out.println(isHollowGPT(test5));
        System.out.println(isHollowGPT(test6));
        System.out.println(isHollowGPT(allZero));
        System.out.println("----------God---------");
        System.out.println(middleZero(test1));
        System.out.println(middleZero(test2));
        System.out.println(middleZero(test3));
        System.out.println(middleZero(test4));
        System.out.println(middleZero(test5));
        System.out.println(middleZero(test6));
        System.out.println(middleZero(allZero));
    }
}
