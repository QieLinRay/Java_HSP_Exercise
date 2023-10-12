package com.extend_;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base(String name, int age) {
        System.out.println("父类Base(String name, int age)构造器被调用");
    }

    public Base() {
        System.out.println("父类的构造器被调用");
    }

    public Base(String name){
        System.out.println("父类Base(String name)构造器被调用");
    }

    public int getN4(){
        return n4;
    }

    public void test100(){
        System.out.println("test100");
    }

    public void test200(){
        System.out.println("test200");
    }

    public void test300(){
        System.out.println("test300");
    }

    public void test400(){
        System.out.println("test400");
    }
    public void callTest400(){
        test400();
    }

}
