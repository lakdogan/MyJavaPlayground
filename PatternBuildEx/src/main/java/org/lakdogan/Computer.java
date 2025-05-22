package org.lakdogan;

public class Computer {
    private final String marke;
    private final String cpu;
    private final String ram;
    private final String festplatte;


    public Computer(String marke, String cpu, String ram, String festplatte) {
        this.marke = marke;
        this.cpu = cpu;
        this.ram = ram;
        this.festplatte = festplatte;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMarke() {
        return marke;
    }

    public String getRam() {
        return ram;
    }

    public String getFestplatte() {
        return festplatte;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "marke='" + marke + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", festplatte='" + festplatte + '\'' +
                '}';
    }
}