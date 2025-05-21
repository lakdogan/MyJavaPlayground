package org.lakdogan;

public class Rechner {

    public static double addieren(double a, double b) {
        return a + b;
    }

    public static double subtrahieren(double a, double b) {
        return a - b;
    }

    public static double multiplizieren(double a, double b) {
        return  a * b;
    }

    public static double dividieren(double a, double b) {
        if (b == 0) {
            System.out.println("Achtung: Division durch 0 ist nicht erlaubt!");
            return 0;
        }
        return a / b;
    }
}
