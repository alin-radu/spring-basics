package com.dev;

public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Laptop Constructor");
    }

    public void compile() {
        System.out.println("Compile from the Laptop.");
    }
}
