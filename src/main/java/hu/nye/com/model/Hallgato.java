package hu.nye.com.model;

public class Hallgato extends Targy{
    private String nev;
    private int targyakSzama;


    public Hallgato(String nev, int targyakSzama) {
        this.nev=nev;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getTargyakSzama() {
        return targyakSzama;
    }

    public void setTargyakSzama(int targyakSzama) {
        this.targyakSzama = targyakSzama;
    }

    @Override
    public String toString() {
        return "Hallgato{" +
                "nev='" + nev + '\'' +
                ", targyakSzama=" + targyakSzama +'\'' +
                '}';
    }
}
