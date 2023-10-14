package com.poly.PolyParameters;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("The worker is working");

    }

    public String getAnnual(){
        return "Worker's salary is" + this.getSalary() * 12;
    }

}
