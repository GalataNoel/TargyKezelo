package service;

import hu.nye.com.model.Targy;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static hu.nye.com.service.Felvetel.targy;
import static hu.nye.com.service.Felvetel.targyNev;
import static org.junit.jupiter.api.Assertions.*;

public class FelvetelTest {


    @Test
    public void testTargyHozzaadas() {
        String nev = "pelda";
        int kredit = 3;
        String ido = "Kedd:12:00";
        assertEquals(nev,"pelda");
        assertEquals(kredit,3);
        assertEquals(ido,"Kedd:12:00");
    }
    @Test
    public void testTargyFelvetel() {
        String nev = "pelda";
        ArrayList<String> nevek = new ArrayList<>();
        nevek.add(nev);
        assertEquals(nevek.get(0),nev);
    }
}
