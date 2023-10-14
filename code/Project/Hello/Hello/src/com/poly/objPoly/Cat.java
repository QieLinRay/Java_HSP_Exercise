package com.poly.objPoly;

public class Cat extends Animal{
    public void eat(){
        System.out.println("Cat eat()...");
    }

    public void sleep(){
        System.out.println("CAT sleep");
    }

    public void  catchMouse(){
        System.out.println("Cat is catching mouse..");

    }

    private void sleep(int hour){
        System.out.println("Cat private sleep()...");
    }
    public void sleep(String hour){
        System.out.println("Cat public sleep()...");
    }
}
