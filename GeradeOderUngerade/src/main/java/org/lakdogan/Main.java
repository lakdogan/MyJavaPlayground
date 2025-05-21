package org.lakdogan;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib eine ganze Zahl ein: ");
        int zahl = scanner.nextInt();

        if (zahl % 2 == 0) {
            System.out.println("Die Zahl " + zahl + " ist gerade.");
        } else {
            System.out.println("Die Zahl " + zahl + " ist ungerade.");
        }

        scanner.close();
    }
}
