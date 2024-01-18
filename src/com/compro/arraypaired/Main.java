package com.compro.arraypaired;

public class Main {
    public static int isPaired(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] % 2 == 0) {
                return 0;
            }
            if (i % 2 == 1 && arr[i] %2 == 1) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] pair = {1,4,7,2};
        int[] unpair = {0,1,3,2};
        System.out.println("pair: "+ isPaired(pair));
        System.out.println("unpair: "+ isPaired(unpair));
    }
}
