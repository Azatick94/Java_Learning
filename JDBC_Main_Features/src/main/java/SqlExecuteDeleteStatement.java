import repository.JdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Example of SQL delete statement
public class SqlExecuteDeleteStatement {
    public static void main(String[] args) {

        // JDBC SQL query statement
        PreparedStatement statement = null;
        try {
            Connection conn = JdbcConnection.getConnection();
            statement = conn.prepareStatement("DELETE FROM users WHERE first_name=?");
            statement.setString(1, "TestName");

            int deletedRows = statement.executeUpdate();
            System.out.println("I just deleted " + deletedRows + " users");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
