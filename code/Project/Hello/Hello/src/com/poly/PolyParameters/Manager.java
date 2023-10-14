package com.poly.PolyParameters;

public class Manager extends Employee{
    private double bonus;

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("The manager is managing..");
    }

    public String getAnnual(){
       return "Manager's salary is" + this.getSalary() * 12 + "bonus is " + this.getBonus();
    }
}
