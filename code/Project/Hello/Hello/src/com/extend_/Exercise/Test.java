package com.extend_.Exercise;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("Intel");
        NotePad notePad = new NotePad("white");

        System.out.println("-------PC--------");
        System.out.println("CPU" + pc.getCPU());
        System.out.println("brand" + pc.getBrand());

        System.out.println("-------notePad-------");
        System.out.println("Disk" + notePad.getDisk());
        System.out.println("color" + notePad.getColor());


    }
}
