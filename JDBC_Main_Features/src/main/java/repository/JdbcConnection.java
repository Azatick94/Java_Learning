package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

    // DataBase connection information
    private static final String url = "jdbc:postgresql://localhost:5432/jdbc_demoDB";
    private static final String username = "postgres";
    private static final String password = "postgres";
    private static Connection conn;

    static {
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }

}
