package org.lakdogan;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sammlung<String> namen = new Sammlung<>();
        namen.einfuegen("Peter");
        namen.einfuegen("Bruce");
        namen.einfuegen("Carol");

        List<String> namensliste = namen.getAll();
        System.out.println(namensliste);
        System.out.println();

        Sammlung<Integer> zahlen = new Sammlung<>();
        zahlen.einfuegen(1);
        zahlen.einfuegen(42);
        List<Integer> zahlenliste = zahlen.getAll();
        System.out.println(zahlenliste);
        System.out.println();

        Sammlung<Person> personen = new Sammlung<>();
        personen.einfuegen(new Person("Alongkorn"));
        personen.einfuegen(new Person("Panna"));
        personen.einfuegen(new Person("Samed"));
        System.out.println(personen.getAll());
        System.out.println();

        Sammlung<Double> koerpergroesse = new Sammlung<>();
        koerpergroesse.einfuegen(1.2);
        koerpergroesse.einfuegen(1.3);
        koerpergroesse.einfuegen(1.4);
        koerpergroesse.einfuegen(1.5);
        koerpergroesse.einfuegen(1.6);
        koerpergroesse.einfuegen(1.7);
        List<Double> groessenliste = koerpergroesse.getAll();
        System.out.println(groessenliste);
        System.out.println();

    }
}