package com.extend_.Exercise;

public class NotePad extends Computer{
    String color;

    public NotePad() {
    }

    public NotePad(String color) {
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
