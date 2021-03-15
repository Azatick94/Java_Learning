import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

// A connection pool keeps open a small number of database connections (think: 10)
// and instead of opening up database connections yourself,
// you’ll ask the connection pool to give you one of these (10) connections.
// So it is good in term of performance. Not required to open always new connection. DataSource does it for us.
public class JdbcConnectionPools {

    public static void main(String[] args) throws SQLException {
        DataSource dataSource = createDataSource();

        try (Connection conn = dataSource.getConnection()) {
            // "0" means disabling the timeout, when doing isValid checks
            boolean isValid = conn.isValid(0);
            System.out.println("Do we have a valid db connection? = " + isValid);
            // Do something with the Connection, run some SQL statements
        }
    }

    private static DataSource createDataSource() {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:postgresql://localhost:5432/jdbc_demoDB");
        ds.setUsername("postgres");
        ds.setPassword("postgres");
        return ds;
    }
}
