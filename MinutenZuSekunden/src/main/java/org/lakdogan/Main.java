package org.lakdogan;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wieviele Minuten möchten Sie in Sekunden umrechnen? ");
        int minuten = scanner.nextInt();

        int sekunden = minuten * 60;
        System.out.println(minuten + " Minuten sind " + sekunden + " Sekunden.");

        scanner.close();
    }
}