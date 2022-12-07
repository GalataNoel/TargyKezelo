package hu.nye.com.service;

import hu.nye.com.model.Hallgato;
import hu.nye.com.model.Targy;
import org.iq80.snappy.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Felvetel {

    public static String targyNev;
    public static int targyKredit;
    public static String targyIdo;

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
        Targy targy = new Targy(targyNev,targyKredit,targyIdo);
        System.out.println(targy);
    }
    public void targyFelvetel(String targyNev,int targyKredit,String targyIdo) throws IOException {
        Hallgato hallgato1;
        System.out.println("Fel akarod venni a " +targyNev+"-t? (igen/nem)");
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        String felvetel = reader4.readLine();
        if(felvetel.equalsIgnoreCase("igen")){
            hallgato1 = new Hallgato("fe",3);
            System.out.println(hallgato1);

            //TODO: a hallgató által felvett tárgyakat is kiírni (kell Targy targy= new Targy(); talán)
            System.out.println("Fel akarsz venni még egy tárgyat? (igen/nem)");
            BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
            String felvetel2 = reader5.readLine();
            if(felvetel2.equalsIgnoreCase("igen")){
                targyHozzaadas();
            }else if(felvetel2.equalsIgnoreCase("nem")){
                System.out.println(hallgato1);
            }
        }else if(felvetel.equalsIgnoreCase("nem")){
                System.out.println("hallgato1 adatai");
        }
    }
}
