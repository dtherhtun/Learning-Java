package com.compro.MadhavArray;

public class Main {
    public static boolean isMadhavArray(int[] arr){


        for (int i = 0; i < arr.length; i++) {
            if (arr.length == i *(i +1)/2) {
                int index = 0;
                boolean flag = true;
                for (int j = 1; j <= i; j++) {
                    int sum = 0;

                    for (int k = 0; k < j; k++) {
                        if (index < arr.length) {
                            sum = sum + arr[index];
                            System.out.println(index);
                            index++;
                        }
                    }
                    if (arr[0] != sum) {
                        flag = false;
                    }
                }
                return flag;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{ 15, 14, 1, 0, 11, 4, 2 ,3 , 5, 5, 1, 2, 3, 7, 2} ));
    }
}
