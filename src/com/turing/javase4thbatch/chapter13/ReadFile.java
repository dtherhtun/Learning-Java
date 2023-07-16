package com.turing.javase4thbatch.chapter13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("./");
            System.out.println("File: "+ file.getAbsolutePath());
            FileInputStream fin = new FileInputStream("./src/com/turing/javase4thbatch/chapter13/hello.txt");

            int data;
            try {
                do {
                    data = fin.read();
                    if (data != -1){
                        System.out.print((char) data);
                    }
                }while (data != -1);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                fin.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
