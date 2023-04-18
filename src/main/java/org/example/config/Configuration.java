package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Configuration {

    private static final String url = "jdbc:postgresql://localhost:5432/for_practice";
    private static final String userName = "postgres";
    private static final String password = "1234";

    public static Connection connectionToDatabase() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    url,
                    userName,
                    password
            );
            System.out.println("Successfully connected to database...");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
