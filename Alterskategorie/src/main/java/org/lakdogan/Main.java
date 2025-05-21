package org.lakdogan;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gib dein Alter ein (ganze Zahl): ");
        int alter = scanner.nextInt();

        if (alter < 0) {
            System.out.println("Ungültige Eingabe. Alter kann nicht negativ sein.");
        } else if (alter <= 12) {
            System.out.println("Du bist ein Kind.");
        } else if (alter <= 19) {
            System.out.println("Du bist ein Teenager.");
        } else if (alter <= 64) {
            System.out.println("Du bist ein Erwachsener.");
        } else {
            System.out.println("Du bist ein Senior.");
        }

        scanner.close();
    }
}