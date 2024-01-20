package com.compro.MadhavArray;

public class Main {
    public static boolean isMadhavArray(int[] arr){
        if (arr.length < 3) return false;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length == i *(i +1)/2) {
                int index = 0;
                boolean flag = true;
                for (int j = 1; j <= i; j++) {
                    int sum = 0;

                    for (int k = 0; k < j; k++) {
                        sum = sum + arr[index];
                        index++;
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

    static boolean isMadhavArrayFor(int[] arr) {
        if (arr.length < 3) return false;

        int index = 2;
        for ( int i = 1;i < arr.length;) {

            int sum = 0;
            for (int j = 0; j < index; j++, i++) {

                sum +=arr[i];
            }

            if(sum != arr[0]) return false;

            if(i == arr.length) {
                if(index*(index+1)/2 == arr.length) {
                    return true;
                }
            } else {
                index++;
                if((i+index) > arr.length) {
                    return false;
                }
            }
        }
        return true;
    }

    static int isMadhavArrayGod(int[ ] a) {
        if(a.length < 3 )
            return 0;

        int i = 1, counter = 2;
        while (i < a.length) {

            int sum = 0;
            for (int j = 0; j < counter; j++, i++) {

                sum +=a[i];
            }

            if(sum != a[0])
                return 0;

            if(i == a.length)
            {
                if(counter*(counter+1)/2 == a.length)
                    return 1;
            }
            else {
                counter++;
                if((i+counter) > a.length)
                    return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{ 15, 14, 1, 0, 11, 4, 2 ,3 , 5, 5, 1, 2, 3, 7, 2} ));
        System.out.println(isMadhavArrayGod(new int[]{ 15, 14, 1, 0, 11, 4, 2 ,3 , 5, 5, 1, 2, 3, 7, 2} ));
        System.out.println(isMadhavArrayFor(new int[]{ 15, 14, 1, 0, 11, 4, 2 ,3 , 5, 5, 1, 2, 3, 7, 2} ));
    }
}
