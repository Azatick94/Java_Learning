import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Simple example how to connect to DataBase
public class SimpleDBConnectionExample {
    public static void main(String[] args) {

        // DataBase connection information
        String url = "jdbc:postgresql://localhost:5432/jdbc_demoDB";
        String username = "postgres";
        String password = "postgres";

        // connection to DataBase
        try (Connection conn = DriverManager.getConnection(url, username, password)) {

            boolean valid = conn.isValid(0);
            System.out.println("Do we have valid connection: " + valid);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
