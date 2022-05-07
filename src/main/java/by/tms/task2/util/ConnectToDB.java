package by.tms.task2.util;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {

    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/calculation_users";
    private static final String USER = "root";
    private static final String PASSWORD = "daniilradkovich";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
                return connection;
        } catch (Exception e) {
            System.out.println("Connection failed...");

            System.out.println(e);
        }
        return null;
    }
}

