package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DatabaseHelper {

    private static final String DB_URL = "jdbc:sqlite:resources/database/quotes.db";

    public static void initializeDB() {
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            String createTable = "CREATE TABLE IF NOT EXISTS favorite_quotes (id INTEGER PRIMARY KEY, quote TEXT)";
            stmt.execute(createTable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveFavoriteQuote(String quote) {
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO favorite_quotes (quote) VALUES (?)")) {
            pstmt.setString(1, quote);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> getFavoriteQuotes() {
        ArrayList<String> favorites = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM favorite_quotes")) {
            while (rs.next()) {
                favorites.add(rs.getString("quote"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return favorites;
    }
}