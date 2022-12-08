package hu.nye.com;

import hu.nye.com.model.Targy;
import hu.nye.com.service.Felvetel;

import java.io.IOException;
import java.sql.*;

/**
 * .
 */
public class Main extends Felvetel {
    public static void main(String[] args) throws IOException, SQLException {
        Felvetel felvetel = new Felvetel();
        felvetel.targyHozzaadas();

        //TODO: unit és performance teszteket írni, megnézni a ci/cd pipeline-t, adatbázist csinálni hozzá
        felvetel.targyFelvetel();
    }
}