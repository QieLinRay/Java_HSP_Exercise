package com.object;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {


        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.getAge()== p.getAge() && this.getName().equals(p.getName());
        }
        return false;

    }
}
