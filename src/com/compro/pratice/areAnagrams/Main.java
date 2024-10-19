package com.compro.pratice.areAnagrams;

public class Main {
    public static int areAnagrams(char[] a1, char[] a2) {
        boolean flag = false;
        for (char a : a1) {
            flag = false;
            for (char b : a2) {
                if (a == b) {
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

        return flag ? 1 : 0;
    }

    public static int areAnagramsPMK(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return 0;
        }
        int valueOfa1 = 0;
        int valueOfa2 = 0;
        for (char a : a1) {
            valueOfa1 += a;
        }

        for (char a : a2) {
            valueOfa2 += a;
        }

        if (valueOfa1 != valueOfa2) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(areAnagrams(new char[]{'p', 'i', 'o'}, new char[]{'g', 'i', 'p'}));
        System.out.println(areAnagramsPMK(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(areAnagramsPMK(new char[]{'p', 'i', 'o'}, new char[]{'g', 'i', 'p'}));
    }
}
