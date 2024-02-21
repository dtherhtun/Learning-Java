package com.compro.centerSum15;

public class Main {

    // wrong with this case int[]{1, 2, 3, 2, 1, 1, 2, 9, 6, 9, 5}
    public static int isCentered15(int[] a){
        int after = 0;
        int before = 0;
        for (int i = 1; i < a.length/2; i++) {
            int sum = 0;
            before = i;
            for (int j = i; j < a.length; j++) {
                if (sum == 15) {
                    after = j;
                    break;
                } else {
                    sum +=a[j];
                }
            }
        }
        System.out.println("after-> "+after+" before-> "+before+" (a.length-after)-> "+ (a.length-after)+" length-> "+a.length);
        if (before != a.length-after){
            return 0;
        }
        return 1;
    }

    // correct
    public static  int isCentered15God(int[] a) {
        for (int i = 0; i <=(a.length / 2); i++) {
            int sum = 0;
            for (int j = i; j < (a.length - i); j++) {
                sum += a[j];
            }
            if (sum == 15)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{3, 2, 6, 7, 2, 1, 6}));
        System.out.println(isCentered15(new int[]{1, 2, 3, 2, 6, 7, 2, 1, 6, 9, 5}));
        System.out.println(isCentered15(new int[]{3, 2, 6, 7, 4, 1, 6}));
        System.out.println("-----------");
        System.out.println(isCentered15God(new int[]{1, 1, 1, 1,1, 2, 2}));
        System.out.println(isCentered15God(new int[]{3, 2, 6, 7, 2, 1, 6 }));
        System.out.println(isCentered15God(new int[]{1, 2, 3, 2, 6, 7, 2, 1, 6, 9, 5}));
        System.out.println(isCentered15God(new int[]{1, 2, 3, 2, 1, 1, 2, 9, 6, 9, 5}));
        System.out.println(isCentered15(new int[]{1, 2, 3, 2, 1, 1, 2, 9, 6, 9, 5}));
    }
}
