package com.turing.javase4thbatch.chapter12;

public class WrapperProblem {
    public static void main(String[] args) {
        Integer i = 127;
        Integer j = 127;

        System.out.println("i==j "+ (i==j)+ " value = "+i);

        i = 128;
        j = 128;

        System.out.println("i==j "+ (i==j)+ " value = "+i);

        i = new Integer(128);
        j = new Integer(128);
        System.out.println("Ref eq = "+ (i==j)+ " value = "+i);
        System.out.println("i==j "+ (i.intValue()==j.intValue())+ " value = "+i);

        i = Integer.valueOf(127);
        j = Integer.valueOf("127");

        System.out.println("Ref eq = "+ (i==j)+ " value = "+i);

        i = Integer.valueOf(128);
        j = Integer.valueOf("128");

        System.out.println("Ref eq = "+ (i==j)+ " value = "+i);
    }
}
