package com.turing.javase4thbatch.chapter7;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder =  new StringBuilder("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            builder.append("How are you");
        }
        long end = System.currentTimeMillis();

        long time = end - start;
        System.out.println("MS - "+ time);
    }
}
