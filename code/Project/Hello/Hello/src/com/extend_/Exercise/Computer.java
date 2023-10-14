package com.extend_.Exercise;

public class Computer {
    private String CPU = "i7";
    private String Memonry = "12G";
    private String Disk = "256G";

    public Computer() {
        this.setCPU(CPU);
        this.setDisk(Disk);
        this.setMemonry(Memonry);
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemonry() {
        return Memonry;
    }

    public void setMemonry(String memonry) {
        Memonry = memonry;
    }

    public String getDisk() {
        return Disk;
    }

    public void setDisk(String disk) {
        Disk = disk;
    }
}
