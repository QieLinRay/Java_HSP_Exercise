package com.extend_;

public class student {
    public String name;
    private int age;
    private double score;

    public student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public student() {
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
