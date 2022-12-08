package hu.nye.com.model;

/**
 * .
 */
public class Targy {
    public String targyNev;
    public int kreditSzam;
    public String idoPont;

    public Targy(String nev, int kreditSzam, String idoPont) {
        this.targyNev = nev;
        this.kreditSzam = kreditSzam;
        this.idoPont = idoPont;
    }

    public Targy() {

    }

    public String getTargyNev() {
        return targyNev;
    }

    public void setTargyNev(String targyNev) {
        this.targyNev = targyNev;
    }

    public int getKreditSzam() {
        return kreditSzam;
    }

    public void setKreditSzam(int kreditSzam) {
        this.kreditSzam = kreditSzam;
    }

    public String getIdoPont() {
        return idoPont;
    }

    public void setIdoPont(String idoPont) {
        this.idoPont = idoPont;
    }

    @Override
    public String toString() {
        return "Targy{" +
                "targyNev='" + targyNev + '\'' +
                ", kreditSzam=" + kreditSzam +
                ", idoPont='" + idoPont + '\'' +
                '}';
    }
}
