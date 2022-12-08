package hu.nye.com.model;

import java.util.ArrayList;

/**
 * .
 */
public class Hallgato extends Targy {
    private String nev;
    private ArrayList<Targy> targyak= new ArrayList<>();

    public Hallgato(String nev, ArrayList<Targy> targyak) {
        this.nev = nev;
        this.targyak = targyak;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public ArrayList<Targy> getTargyak() {
        return targyak;
    }

    public void setTargyak(ArrayList<Targy> targyak) {
        this.targyak = targyak;
    }

    @Override
    public String toString() {
        return "Hallgato{" +
                "nev='" + nev + '\'' +
                ", targyak=" + targyak +
                '}';
    }
}
