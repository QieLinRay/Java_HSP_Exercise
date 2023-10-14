package com.extend_.Exercise;

public class PC extends Computer{
    String brand;

    public PC() {
        super();
    }

    public PC(String brand) {
        this.setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
