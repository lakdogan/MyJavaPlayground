//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug("AUDI", "HN:AB-123", "Q7");
        System.out.println("Fahrzeug f1 Objekt erstellt und die Attribute der Klasse Fahrzeug wurde durch den Konstruktor initialisiert:");
        System.out.println(f1);
        f1.fahre100km();
        System.out.println("Die fahre100km() Methode wurde aufgerufen");
        System.out.println(f1);
        f1.fahreKM(235);
        System.out.println("Die fahreKM(int km) Methode wurde aufgerufen und es wurden 235 an das Parameter km übergeben");
        System.out.println(f1);
        System.out.println();
        Fahrzeug f2 = new Fahrzeug("AUDI", "HN:CD-456", "A6");
        System.out.println("Fahrzeug f2 Objekt erstellt und die Attribute der Klasse Fahrzeug wurde durch den Konstruktor initialisiert: ");
        System.out.println(f2);
        f2.fahreKM(32510);
        System.out.println("Die fahreKM(int km) Methode wurde aufgerufen und es wurden 32510 an das Parameter km übergeben");
        System.out.println(f2);
    }
}