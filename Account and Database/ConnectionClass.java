import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionClass {
    Connection connection;
    Statement statement;

    ConnectionClass() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306//bdsystem", "root", "nadarshah@7881");
            statement = connection.createStatement();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}