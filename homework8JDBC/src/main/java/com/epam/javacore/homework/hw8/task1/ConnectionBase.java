package com.epam.javacore.homework.hw8.task1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBase {
    private static Connection connection;
    private static final String URL="jdbc:postgresql://localhost:5432/booklibrary";
    private static final String DB_USERNAME="postgres";
    private static final String DB_DRIVER="org.postgresql.Driver";

    public static Connection getConnection() {
        if (connection == null) {
            connect();
        }
        return connection;
    }

    public static void disconnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Store: disconnection successful");
        }
    }

    private static void connect() {
        try {
            Class.forName(DB_DRIVER);
            System.out.println("JDBC driver connected");
            connection = DriverManager.getConnection(URL, DB_USERNAME, "rootpass");
            System.out.println("Store: connection successful");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
