package com.compro.sample.clusterCompression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
//    public static int[] clusterCompression(int[] a){
//        if (a.length < 1) return a;
//        int j = 1;
//        int numClusters = 0;
//        for (int i = 0; i < a.length ; i++, j++) {
//            if (j == a.length) {
//                j--;
//                numClusters++;
//            }
//            if (a[i] != a[j]) {
//                numClusters++;
//            }
//        }
//        j = 1;
//        int k = 0;
//        int[] result = new int[numClusters];
//        for (int i = 0; i < a.length ; i++, j++) {
//            if (j == a.length) {
//                j--;
//                result[k] = a[j];
//            }
//
//            if (a[i] != a[j]) {
//                result[k] = a[i];
//                k++;
//            }
//        }
//        return result;
//    }
    public static int[] clusterCompression(int[] a){
        if (a.length < 1) return a;

        int numClusters = 1;
        int prev = a[0];
        for (int i = 0; i < a.length; i++) {
            if (prev != a[i]) {
                numClusters++;
                prev = a[i];
            }
        }
        int[] result = new int[numClusters];
        int j = 0;
        prev = a[0];
        for (int i = 0; i < a.length; i++) {
            if (prev != a[i]){
                j++;
                result[j] = a[i];
                prev = a[i];
            } else {
                result[j] = prev;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{18})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{-5, -5, -5, -5, -5})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2})));
    }
}
