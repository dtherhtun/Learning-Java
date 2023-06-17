package com.turing.javase4thbatch.chapter7;

class Base {
    final void method(){
        System.out.println("Cannot override");
    }
}

class Child extends Base {
    /* 'method()' cannot override 'method()' in 'com.turing.javase4thbatch.chapter7.Base'; overridden method is final
    void method(){

    }
    */
}

final class FinalClass {

}
/* Cannot inherit from final 'com.turing.javase4thbatch.chapter7.FinalClass'
class AnotherChild extends FinalClass {
}
 */
public class FinalUsage {
    public static void main(String[] args) {
        final double PI = 3.14;
        // PI = 2; Cannot assign a value to final variable 'PI'
    }
}
