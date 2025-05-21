package org.lakdogan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int geheimZahl = (int) (Math.random() * 10) + 1;
        int versuche = 5;
        boolean gewonnen = false;

        System.out.println("Willkommen beim Zahlenraten-Spiel!");
        System.out.println("Errate die Zahl zwischen 1 und 10. Du hast " + versuche + " Versuche.");

        while (versuche > 0) {
            System.out.println("Dein Tipp: ");
            int tipp = scanner.nextInt();

            if (tipp == geheimZahl) {
                gewonnen = true;
                break;
            } else {
                versuche--;
                if (versuche > 0) {
                    System.out.println("Falsch! Du hast noch " + versuche + " Versuche.");
                }
            }
        }

        if (gewonnen) {
            System.out.println("Glückwunsch! Du hast die Zahl " + geheimZahl + " richtig erraten.");
        } else {
            System.out.println("Game Over. Die richtige Zahl war: " + geheimZahl);
        }

        scanner.close();
    }
}