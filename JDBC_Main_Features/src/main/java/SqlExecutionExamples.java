import java.sql.*;

// Example of SQL SELECT statement
public class SqlExecutionExamples {
    public static void main(String[] args) {

        // DataBase connection information
        String url = "jdbc:postgresql://localhost:5432/jdbc_demoDB";
        String username = "postgres";
        String password = "postgres";

        // connection to DataBase
        try (Connection conn = DriverManager.getConnection(url, username, password)) {

            // JDBC SQL query statement
            PreparedStatement queryStatement = conn.prepareStatement("SELECT * FROM users WHERE user_id=?");
            queryStatement.setInt(1, 1);

            ResultSet resultSet = queryStatement.executeQuery();

            // will traverse through all found rows
            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("secondary_name");
                String age = resultSet.getString("age");

                System.out.println("firstName: " + firstName);
                System.out.println("lastname: " + lastName);
                System.out.println("age: " + age);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
