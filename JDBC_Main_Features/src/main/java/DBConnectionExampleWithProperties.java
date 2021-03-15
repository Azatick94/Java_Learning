import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// Connecting to DataBase and using Properties file as an information for connection.
public class DBConnectionExampleWithProperties {
    public static void main(String[] args) throws IOException {
        // DataBase connection information reading Properties file
        Properties prop = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        // specify properties file to read dbConnection properties file
        InputStream stream = loader.getResourceAsStream("dbConnection.properties");
        prop.load(stream);

        String url = (String) prop.get("url");
        String username = (String) prop.get("username");
        String password = (String) prop.get("password");

        // connection to DataBase
        try (Connection conn = DriverManager.getConnection(url, username, password)) {

            boolean valid = conn.isValid(0);
            System.out.println("Do we have valid connection: " + valid);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
