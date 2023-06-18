package com.turing.javase4thbatch.chapter8;

class Window {
    void screenSaver(){
        System.out.println("Window95 screen saver");
    }
    void microsoftWord(){
        System.out.println("MS word");
    }
    void excel(){
        System.out.println("Excel");
    }
}

class Window98 extends Window {
    void excel(){
        super.excel();
        System.out.println("Added additional behavior");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Window window = new Window();
        window.screenSaver();
        window.excel();
    }
}
