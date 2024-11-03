
import java.sql.*;

class EH8 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BCA", "root", "root");
            System.out.println("Connected to database successfully!");
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading JDBC driver: " + e.getMessage());
        }
    }
}
