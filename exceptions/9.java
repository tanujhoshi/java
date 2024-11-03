
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class EH9 {
    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BCA", "root", "root");
            System.out.println("Connection successful!");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
            throw new RuntimeException("Database connection error: " + e.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                    System.out.println("Connection closed.");
                } catch (SQLException e) {
                    System.err.println("Failed to close connection: " + e.getMessage());
                }
            }
        }
    }
}
