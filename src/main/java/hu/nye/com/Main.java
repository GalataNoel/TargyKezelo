package hu.nye.com;

import hu.nye.com.model.Hallgato;
import hu.nye.com.model.Targy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Mi legyen a tárgy neve?");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mennyi legyen a tárgy kreditszáma??");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mikor lesz a tárgy? (nap:óra:perc)");
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));

        String targyNev = reader1.readLine();
        int targyKredit = Integer.parseInt(reader2.readLine());
        String targyIdo = reader3.readLine();
        Targy targy = new Targy(targyNev,targyKredit,targyIdo);
        System.out.println(targy);

        Hallgato hallgato1 = new Hallgato("fe",3,targyKredit,targyIdo,targyNev);
        System.out.println(hallgato1);

    }
}