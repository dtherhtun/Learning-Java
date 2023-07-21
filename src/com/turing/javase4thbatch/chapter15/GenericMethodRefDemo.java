package com.turing.javase4thbatch.chapter15;

@FunctionalInterface
interface GMRef<T> {
    T transform(T value);
}
public class GenericMethodRefDemo {

    static String upper(String msg){
        return msg.toUpperCase();
    }
    static Integer inc(Integer x){
        return  ++x;
    }

    String appendHi(String msg) {
        return "Hi " + msg;
    }

    public static void main(String[] args) {
        GMRef<Integer> iTransform = GenericMethodRefDemo::inc;
        System.out.println("Int Transform: " + iTransform.transform(20));

        GMRef<String> sTransform = GenericMethodRefDemo::upper;
        System.out.println("Str Transform: " + sTransform.transform("Hello"));

        GenericMethodRefDemo inst = new GenericMethodRefDemo();
        GMRef<String> instTransform = inst::appendHi;
        System.out.println("Str Transform: " + instTransform.transform("Hello"));
    }
}
