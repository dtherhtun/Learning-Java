package com.turing.javase4thbatch.chapter10;

public class ChainException {
    static void demoproc() {
        NullPointerException ne = new NullPointerException("Top layer");
        ne.initCause(new ArithmeticException("cause"));
        throw ne;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException ne){
            ne.printStackTrace();
            System.out.println("Ne "+ ne.getCause().getMessage());
        }
    }
}
