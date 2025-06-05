package org.lakdogan.quizapp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/quiz_db?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // falls du ein Passwort hast, hier eintragen

    public static Connection connect() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Erfolgreich mit der Datenbank verbunden!");
            return conn;
        } catch (SQLException e) {
            System.out.println("❌ Verbindung fehlgeschlagen!");
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        connect();
    }
}
