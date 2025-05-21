//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Buch buch1 = new Buch("Der kleine Prinz", "Antoine de Saint-Exupéry", 96, 8.99);
        Buch buch2 = new Buch("1984", "George Orwell", 328, 10.50);
        Buch buch3 = new Buch("Die Verwandlung", "Franz Kafka", 74, 6.95);
        Buch buch4 = new Buch("Harry Potter", "J.K. Rowling", 340, 12.90);
        Buch buch5 = new Buch("Java lernen", "Max Mustermann", 450, 19.99);

        buch1.anzeigen();
        buch2.anzeigen();
        buch3.anzeigen();
        buch4.anzeigen();
        buch5.anzeigen();
    }
}
