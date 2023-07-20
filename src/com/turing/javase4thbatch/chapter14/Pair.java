package com.turing.javase4thbatch.chapter14;

public class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    T getFirst() {
        return this.first;
    }

    U getSecond() {
        return this.second;
    }

    public static void main(String[] args) {
        Pair<Integer, String> iStrPair = new Pair<>(1, "hello");
        System.out.println("First: " + iStrPair.getFirst() + " Second: " + iStrPair.getSecond());

        Pair<String, Boolean> StrBolPair = new Pair<>("world", true);
        System.out.println("First: " + StrBolPair.getFirst() + " Second: " + StrBolPair.getSecond());
    }
}
