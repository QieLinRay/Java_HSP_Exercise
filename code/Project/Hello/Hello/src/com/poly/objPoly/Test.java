package com.poly.objPoly;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        //Cat cat  = (Cat) animal;
        ((Cat) animal).catchMouse();
        ((Cat) animal).eat();
        ((Cat) animal).sleep();






    }
}
