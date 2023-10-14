package com.override_;

public class Test {
    public static void main(String[] args) {
        Person jack = new Person("jack", 18);
        Student jackee = new Student("jackee", 10, "1012", 89);
        System.out.println(jack.say());
        System.out.println(jackee.say());
    }
}
