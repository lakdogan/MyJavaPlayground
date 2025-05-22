package org.lakdogan;

public class ComputerBuilder {
    private String marke = "ASUS";
    private String cpu = "Intel Core i9-13900K";
    private String ram = "24GB";
    private String festplatte = "WD Hendon";

    public String getMarke() {
        return marke;
    }

    public ComputerBuilder setMarke(String marke) {
        this.marke = marke;
        return this;
    }

    public String getCpu() {
        return cpu;
    }

    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public String getRam() {
        return ram;
    }

    public ComputerBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public String getFestplatte() {
        return festplatte;
    }

    public ComputerBuilder setFestplatte(String festplatte) {
        this.festplatte = festplatte;
        return  this;
    }

    public Computer build(String marke, String cpu) {
        if (marke == "" || marke == null)
            marke = this.marke;
        if (cpu == "" || cpu == null)
            cpu = this.cpu;
        return new Computer(marke,cpu,ram,festplatte);
    }
}
