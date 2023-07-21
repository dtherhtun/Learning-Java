package com.turing.javase4thbatch.chapter14;

class GenPen<T> {
    T obj;
    GenPen(T obj) {
        this.obj = obj;
    }
    T get() {
        return this.obj;
    }
}

class GenPen2<T> extends GenPen<T> {
    GenPen2(T obj) {
        super(obj);
    }
}
public class GenericInstanceofDemo {
    public static void main(String[] args) {
        GenPen<Integer> gen = new GenPen<>(20);
        GenPen2<Integer> gen2 = new GenPen2<>(10);
        GenPen2<String> str = new GenPen2<>("Hello");

        System.out.println("Gen2 instance of GenPen2: " + (gen2 instanceof GenPen2<?>));
        System.out.println("Gen2 instance of GenPen: " + (gen2 instanceof GenPen<?>));
        System.out.println("str instance of GenPen2: " + (str instanceof GenPen2<?>));
        // shouldn't write like GenPen<String> or GenPen<Integer>
        System.out.println("str instance of GenPen: " + (str instanceof GenPen<?>));

        GenPen<Float> floatGenPen = new GenPen<>(20.2f);
        gen = gen2;
        System.out.println("gen2 result: " + gen.get());
    }
}
