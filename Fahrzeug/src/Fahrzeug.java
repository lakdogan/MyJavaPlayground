
public class Fahrzeug {

    public static int anzahl;

    private String kennzeichen;
    private String marke;
    private String modell;
    private int kmStand;
    private int nr;

    public Fahrzeug(String marke, String kennzeichen, String modell) {
        this.marke = marke;
        this.kennzeichen = kennzeichen;
        this.modell = modell;
        nr = ++anzahl;
    }

    public void fahre100km() {
        kmStand += 100;
    }

    public void fahreKM(int km) {
        if (km >= 0)
            kmStand += km;
    }

    @Override
    public String toString() {
        return "Fahrzeug Nr=" + nr +
                ", kennzeichen='" + kennzeichen + '\'' +
                ", marke='" + marke + '\'' +
                ", modell='" + modell + '\'' +
                ", kmStand=" + kmStand;
    }
}
