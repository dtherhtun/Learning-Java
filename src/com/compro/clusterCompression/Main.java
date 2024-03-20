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
        int[] compress = clusterCompression(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4});
        int[] compress2 = clusterCompression(new int[]{0, 1, 3, 3, 4, 4, 3, 2, 2,8,8,8,8,8,8,8,8,8,0, 2, 2, 4, 0});
        System.out.println(Arrays.toString(compress));
        System.out.println(Arrays.toString(compress2));
    }
}
