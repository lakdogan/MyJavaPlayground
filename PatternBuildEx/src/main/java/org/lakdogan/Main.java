package org.lakdogan;

import org.lakdogan.ComputerBuilder;


public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();

        builder.setRam("16 GB").setFestplatte("512 GB SSD");

        Computer pc1 = builder.build(builder.getMarke(), builder.getCpu());
        System.out.println(pc1);
        Computer pc2 = builder.build("HP", "AMD Ryzen 5 5600G");
        System.out.println(pc2);
        Computer pc3 = builder.build("Lenovo", "Intel Core i7-12700");
        System.out.println(pc3);
        Computer pc4 = builder.build("","");
        System.out.println(pc4);
    }
}