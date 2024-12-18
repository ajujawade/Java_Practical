import java.sql.*;
import java.util.Scanner;

public class CustomerJDBC {
    public static void main(String[] args) {
        // Database URL, username, and password
        final String DB_URL = "jdbc:mysql://localhost:3306/CustomerDB";
        final String DB_USER = "root";
        final String DB_PASSWORD = "Latari1234!";

        // JDBC variables
        Connection conn = null;
        PreparedStatement pstmt = null;

        try (Scanner scanner = new Scanner(System.in)) {
            // Establish a connection to the database
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // SQL query to insert data into the Customer table
            String sql = "INSERT INTO Customer (CID, CName, Address, Ph_No) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            // Accept customer details from the user
            System.out.print("Enter Customer ID (CID): ");
            int cid = scanner.nextInt();
            scanner.nextLine(); // Clear the newline

            System.out.print("Enter Customer Name (CName): ");
            String cname = scanner.nextLine();

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter Phone Number (Ph_No): ");
            String phNo = scanner.nextLine();

            // Set the values for the PreparedStatement
            pstmt.setInt(1, cid);
            pstmt.setString(2, cname);
            pstmt.setString(3, address);
            pstmt.setString(4, phNo);

            // Execute the update
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Customer details inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
