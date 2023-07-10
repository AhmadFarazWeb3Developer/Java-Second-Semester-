import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class ConnectSQL {

    Connection connection;
    Statement statement;

    ConnectSQL() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstdatabase", "root", "nadarshah@7881");
            statement = connection.createStatement();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}