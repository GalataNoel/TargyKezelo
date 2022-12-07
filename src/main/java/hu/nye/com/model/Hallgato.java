package hu.nye.com.model;

public class Hallgato extends Targy{
    private String nev;
    private int targyakSzama;


    public Hallgato(String nev, int targyakSzama, int kreditSzam, String idoPont, String targyNev) {
        super(targyNev, kreditSzam, idoPont);
        this.nev=nev;
        this.targyakSzama=targyakSzama;
        this.targyNev = targyNev;
        this.kreditSzam = kreditSzam;
        this.idoPont = idoPont;
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


    public Hallgato(String nev) {
        this.nev = nev;
    }

    @Override
    public String toString() {
        return "Hallgato{" +
                "nev='" + nev + '\'' +
                ", targyakSzama=" + targyakSzama +'\'' +
                ",  targyNev='" + targyNev + '\'' +
                ", kreditSzam=" + kreditSzam + '\'' +
                ", idoPont='" + idoPont + '\'' +
                '}';
    }
}
