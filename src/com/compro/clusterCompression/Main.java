package com.compro.clusterCompression;

import java.util.Arrays;

public class Main {
    public static int[] clusterCompression(int[ ] a){
        if(a.length == 0) {
            return new int[]{};
        }

        int numClusters = 1;
        int prev = a[0];
        for (int i = 0; i < a.length; i++) {
            if (prev != a[i]) {
                numClusters++;
                prev = a[i];
            }
        }
        prev = a[0];
        int[] result = new int[numClusters];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (prev != a[i]) {
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
