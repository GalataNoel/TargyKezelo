package hu.nye.com.service;

import hu.nye.com.model.Hallgato;
import hu.nye.com.model.Targy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * .
 */
public class Felvetel {

    public static String targyNev;
    public static int targyKredit;
    public static String targyIdo;
    public static Targy targy;
    public static ArrayList<Targy> targyak = new ArrayList<>();
    /**
     * felvehető tárgyak hozzáadása.
     */
    public void targyHozzaadas() throws IOException {
        System.out.println("Add meg a tárgy adatait!");
        System.out.println("");
        System.out.println("Mi legyen a tárgy neve?");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mennyi legyen a tárgy kreditszáma??");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mikor lesz a tárgy? (nap:óra:perc)");
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));

        targyNev = reader1.readLine();
        targyKredit = Integer.parseInt(reader2.readLine());
        targyIdo = reader3.readLine();
        targy = new Targy(targyNev, targyKredit, targyIdo);
        System.out.println(targy);
    }

    /**
     * a hallgató a tárgyat felveheti, és a felvett tárgyakat megjeleníti.
     */
    public void targyFelvetel() throws IOException {
        Hallgato hallgato1;

        System.out.println("Fel akarod venni a " + targy.getTargyNev() + "-t? (igen/nem)");
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        String felvetel = reader4.readLine();
        if (felvetel.equalsIgnoreCase("igen")) {
            hallgato1 = new Hallgato("Noel", targyak);
            targyak.add(targy);
            System.out.println("Fel akarsz venni még egy tárgyat? (igen/nem)");
            BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
            String felvetel2 = reader5.readLine();
            if (felvetel2.equalsIgnoreCase("igen")) {
                targyHozzaadas();
                targyFelvetel();
            } else if (felvetel2.equalsIgnoreCase("nem")) {
                System.out.println(hallgato1);
            }
        } else if (felvetel.equalsIgnoreCase("nem")) {
            System.out.println("Nincs felvett tárgyad!");
            targyFelvetel();
        }
    }
}
