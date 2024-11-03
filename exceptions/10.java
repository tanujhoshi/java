
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class EH10 {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BCA", "root", "root");
            Statement statement = connection.createStatement();

            String insertQuery = "INSERT INTO student (rollno,name) VALUES (1,'ABCD')";
            int rowsInserted = statement.executeUpdate(insertQuery);
            if (rowsInserted == 0) {
                throw new SQLException("Insert operation failed.");
            }
            System.out.println("Insert successful!");

            String updateQuery = "UPDATE student SET name = 'XYZ' WHERE rollno = 1";
            int rowsUpdated = statement.executeUpdate(updateQuery);
            if (rowsUpdated == 0) {
                throw new SQLException("Update operation failed.");
            }
            System.out.println("Update successful!");

            String deleteQuery = "DELETE FROM student WHERE rollno = 1";
            int rowsDeleted = statement.executeUpdate(deleteQuery);
            if (rowsDeleted == 0) {
                throw new SQLException("Delete operation failed.");
            }
            System.out.println("Delete successful!");

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL operation failed: " + e.getMessage());
            throw new RuntimeException("Database operation error: " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Connection closed.");
                } catch (SQLException e) {
                    System.err.println("Failed to close connection: " + e.getMessage());
                }
            }
        }
    }
}
