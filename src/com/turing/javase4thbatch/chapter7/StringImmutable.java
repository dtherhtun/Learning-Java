package com.turing.javase4thbatch.chapter7;

public class StringImmutable {
    public static void main(String[] args) {
        String str = "";

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            str += "How are you?";
        }
        long end = System.currentTimeMillis();

        long time = end - start;
        System.out.println("MS - "+ time);
    }
}
