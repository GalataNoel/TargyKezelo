package hu.nye.com;

import hu.nye.com.model.Hallgato;
import hu.nye.com.model.Targy;
import hu.nye.com.service.Felvetel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Felvetel{
    public static void main(String[] args) throws IOException {
        /**
        System.out.println("Add meg a tárgy adatait!");
        System.out.println("");
        System.out.println("Mi legyen a tárgy neve?");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mennyi legyen a tárgy kreditszáma??");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mikor lesz a tárgy? (nap:óra:perc)");
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        */
        Felvetel felvetel34 = new Felvetel();
        /**String targyNev = reader1.readLine();
        int targyKredit = Integer.parseInt(reader2.readLine());
        String targyIdo = reader3.readLine();*/
        felvetel34.targyHozzaadas();


        felvetel34.targyFelvetel(targyNev,targyKredit,targyIdo);



        /**System.out.println("Fel akarod venni a " +targyNev+"-t? (igen/nem");
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        String felvetel = reader4.readLine();
        if(felvetel.equalsIgnoreCase("igen")){
            Hallgato hallgato1 = new Hallgato("fe",3,targyKredit,targyIdo,targyNev);
            System.out.println(hallgato1);
        }else if(felvetel.equalsIgnoreCase("")){
            targyHozzaadas();
        }*/
    }
}