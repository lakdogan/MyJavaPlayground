package org.lakdogan;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib dein Alter ein: ");
        int alter = scanner.nextInt();

        System.out.print("Gib den Preis des Produkts ein: ");
        double preis = scanner.nextDouble();

        double rabattProzent;
        if (alter < 18) {
            rabattProzent = 20.0;
        } else {
            rabattProzent = 10.0;
        }

        double rabattBetrag = preis * (rabattProzent / 100);
        double endpreis = preis - rabattBetrag;

        System.out.println("Du erhälst " + rabattProzent + "% Rabatt.");
        System.out.printf("Endpreis nach Rabatt: %.2f EUR%n", endpreis);

        scanner.close();
    }
}