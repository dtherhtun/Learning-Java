package com.compro.isVanilla;

public class Main {
    public static int isVanilla(int[] a) {
        if (a.length == 0 ) return 1;
        int f = a[0]%10;
        for (int i = 0; i < a.length; i++) {
//            String s = String.valueOf(a[i]);
            int temp = a[i];
//            for (int j = 0; j < s.length(); j++) {
//                if (f != temp%10) {
//                    return 0;
//                }
//                temp = temp/10;
//            }
            while (true) {
                if (f != temp%10) {
                    return 0;
                }
                temp = temp/10;
                if (temp == 0) {
                    break;
                }
            }
        }
        return 1;
    }

    public static int isVanillaGod(int[] a) {
        if(a.length == 0) {
            return 1;
        }

        String str = "";
        for(int i=0; i < a.length; i++) {
            str = str + Math.abs(a[i]);
        }

        char first = str.charAt(0);
        for(int i=1; i < str.length(); i ++) {
            if(first != str.charAt(i)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isVanilla(new int[]{1, 0, 11, 1111, 1111111}));
        System.out.println(isVanilla(new int[]{11, 101, 1101, 11111}));
//        System.out.println(isVanillaGod(new int[]{1, 1, 11, 1111, 1111111}));
//        System.out.println(isVanillaGod(new int[]{11, 101, 1101, 11111}));
    }
}
