package com.turing.javase4thbatch.chapter14;

class NonGenericSuper {
    String data;
    NonGenericSuper(String d) {
        this.data = d;
    }
    String getStr() {
        return this.data;
    }
}

class GenChild<T> extends NonGenericSuper {
    T value;
    GenChild(T val, String d){
        super(d);
        this.value = val;
    }
    T getValue() {
        return this.value;
    }
}
public class NonGenericSuperDemo {
    public static void main(String[] args) {
        GenChild<Integer> genChild = new GenChild<>(100, "key");
        System.out.println("Int: " + genChild.getValue() + ", Str: " + genChild.getStr());
    }
}
