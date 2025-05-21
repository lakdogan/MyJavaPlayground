package org.lakdogan;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Zahl 1 eingeben: ");
        double zahl1 = scanner.nextDouble();

        System.out.print("Bitte Zahl 2 eingeben: ");
        double zahl2 = scanner.nextDouble();
        System.out.println();
        System.out.println("Addition: " + Rechner.addieren(zahl1, zahl2));
        System.out.println("Subtraktion: " + Rechner.subtrahieren(zahl1, zahl2));
        System.out.println("Multiplikation: " + Rechner.multiplizieren(zahl1, zahl2));
        System.out.println("Division: " + Rechner.dividieren(zahl1, zahl2));

        scanner.close();
    }
}
