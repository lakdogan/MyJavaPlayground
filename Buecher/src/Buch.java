
public class Buch {
    private String titel;
    private String autor;
    private int seitenanzahl;
    private double preis;

    public Buch(String titel, String autor, int seitenanzahl, double preis) {
        this.titel = titel;
        this.autor = autor;
        this.seitenanzahl = seitenanzahl;
        this.preis = preis;
    }

    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public double getPreis() {
        return preis;
    }

    public void anzeigen() {
        System.out.println("Titel: " + titel);
        System.out.println("Autor: " + autor);
        System.out.println("Seitenanzahl: " + seitenanzahl);
        System.out.println("Preis: " + preis + " EUR");
        System.out.println("---------------------------");
    }
}
