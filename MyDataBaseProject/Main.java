import jdk.jshell.SourceCodeAnalysis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Student Data");
        Scanner scanner = new Scanner(System.in);
        try {
            ConnectSQL connectsql = new ConnectSQL();
            String Query = "Insert into mynewtable (name,phoneNo) values (?,?)";
            Connection connection = connectsql.connection;
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1, "Ahmad Faraz");
            statement.setString(2, "03169962046");
            statement.executeUpdate();
            System.out.println("Enrolled");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}