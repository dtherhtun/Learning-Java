package com.turing.javase4thbatch.chapter7;

class Something{
    int something;
    Something(int something) {
        this.something = something;
    }
}
public class ParameterPass {
    void inc(int a){
        System.out.println("A before increase is "+ a);
        a++;
        System.out.println("A after increase is "+ a);
    }

    void Change(Something obj){
        System.out.println("Something before increase is "+ obj.something);
        obj.something++;
        System.out.println("Something after increase is "+ obj.something);
    }

    void Change2(Something obj){
        System.out.println("Something before increase is "+ obj.something);
        obj = new Something(10);
        System.out.println("Something after increase is "+ obj.something);
    }
    public static void main(String[] args) {
        ParameterPass par = new ParameterPass();

        int data = 10;
        par.inc(data);
        System.out.println("Data "+ data);

        Something some = new Something(20);
        par.Change(some);
        System.out.println("Some "+ some.something);

        par.Change2(some);
        System.out.println("Some2 "+ some.something);
    }
}
