package com.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(100);
        person.setName("aa");
        person.setPassword("123");
        person.setSalary(899);
        System.out.println(person.info());


    }
}
class Person{
    private int age;
    private double salary;
    private String password;

    public Person(int age, double salary, String password, String name, String job) {
        this.setSalary(salary);
        this.setPassword(password);
        this.setAge(age);
        this.setName(name);
        this.setJob(job);

    }

    public Person() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String name;

    public String job;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18 && age <60) {
            this.age = age;

        }else {
            System.out.println("年龄不合法，给定默认年龄18");
            this.age = 18;

        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String info(){
        return "name= " + name +" age = " + age + " salary" + salary;
    }
}
