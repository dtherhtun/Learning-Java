package com.turing.javase4thbatch.chapter5;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            if (i == 5)
            {
                continue;
            }
            System.out.println("I is "+ i);
        }
        // Best way
        for (int i = 0; i < 10; i++)
        {
            if (i != 5)
            {
                System.out.println("[without continue] I is "+ i);
            }

        }
    }
}
