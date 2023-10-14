package com.poly.PolyParameters;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("Mary", 100, 10);
        Worker worker= new Worker("Worance", 100);
        Test test = new Test();
        System.out.println(test.showEmployeeAnuual(manager));
        System.out.println(test.showEmployeeAnuual(worker));

    }

    public String showEmployeeAnuual(Employee e){
        return e.getAnnual();
    }
    public void  testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
            "Hello".equals("Hi");



        }

    }
}


