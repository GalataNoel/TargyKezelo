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
        Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/./jdbc-test","sa","password");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * FROM USERS");

        while(resultSet.next()){
            String nev = resultSet.getString("targyNev");
            String kredit = resultSet.getString("targyKredit");
            String ido = resultSet.getString("targyIdo");

            Targy targy1 = new Targy(targyNev,targyKredit,targyIdo);
            System.out.println(targy1);
        }
        resultSet.close();
        statement.close();
        connection.close();

        Felvetel felvetel = new Felvetel();
        felvetel.targyHozzaadas();

        //TODO: unit és performance teszteket írni, megnézni a ci/cd pipeline-t, adatbázist csinálni hozzá
        felvetel.targyFelvetel();
    }
}