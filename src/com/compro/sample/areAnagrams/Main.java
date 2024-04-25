package com.compro.sample.areAnagrams;

public class Main {
    static int areAnagrams(char[] a1, char[] a2) {
        if (a1.length != a2.length) return 0;
        int count = 0;
        int prevCount = 0;

        for (int i = 0; i < a1.length; i++) {
            prevCount = count;
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    count++;
                }
            }
            if (prevCount != count - 1) {
                return 0;
            }
        }
        return count == a1.length ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println(areAnagrams(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println(areAnagrams(new char[]{}, new char[]{}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
        System.out.println(areAnagrams(new char[]{'p', 'o', 'o', 'l'}, new char[]{'p', 'o', 'l', 'l'}));
    }
}
