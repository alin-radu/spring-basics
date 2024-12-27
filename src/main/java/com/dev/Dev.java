package com.dev;

public class Dev {

    private Computer com;

//    private int age;

    public Dev() {
        System.out.println("Dev Default Constructor");
    }

//    public Dev(int age) {
//        this.age = age;
//
//        System.out.println("Dev Variant1 Constructor");
//    }

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//
//        System.out.println("Dev Variant2 Constructor");
//    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    public Computer getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build() {
        System.out.println("Working on Awesome Project");
        com.compile();
    }
}
