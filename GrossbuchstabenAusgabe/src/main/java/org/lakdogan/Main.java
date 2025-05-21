package org.lakdogan;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Alle Großbuchstaben von A bis Z: ");

        for (char buchstabe = 'A'; buchstabe <= 'Z'; buchstabe++) {
            System.out.print(buchstabe + " ");
        }

        System.out.println();
    }
}
