package org.lakdogan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib ein Datum und eine Uhrzeit ein (z.B. 01.06.2021 14:33: ");
        String eingabe = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        try {
            LocalDateTime dateTime = LocalDateTime.parse(eingabe, formatter);
            System.out.println("Erfolgreich geparst: " + dateTime);
        } catch (Exception e) {
            System.out.println("Fehler beim Parsen. Bitte Format beachten: dd.MM.yyyy HH:mm");
        }
        scanner.close();
    }
}