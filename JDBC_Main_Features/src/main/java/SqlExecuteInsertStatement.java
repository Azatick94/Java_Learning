import repository.JdbcConnection;

import java.sql.*;

// Example of SQL insert statement
public class SqlExecuteInsertStatement {
    public static void main(String[] args) {

        // JDBC SQL query statement
        PreparedStatement statement = null;
        try {
            Connection conn = JdbcConnection.getConnection();

            statement = conn.prepareStatement("INSERT INTO users (first_name, secondary_name, age, phone_number) VALUES (?,?,?,?)");
            statement.setString(1, "TestName");
            statement.setString(2, "TestSurname");
            statement.setInt(3, 20);
            statement.setInt(4, 999);
            int insertedRows = statement.executeUpdate();
            System.out.println("I just inserted " + insertedRows + " users");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
