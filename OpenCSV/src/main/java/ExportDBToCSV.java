//import com.opencsv.CSVWriter;
//
//import java.io.FileWriter;
//import java.sql.*;
//
//public class ExportDBToCSV {
//    public static void main(String[] args) throws Exception {
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_db", "root", "password");
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
//
//        try (CSVWriter writer = new CSVWriter(new FileWriter("openCSV/src/main/resources/employees_report.csv"))) {
//            writer.writeNext(new String[]{"Employee ID", "Name", "Department", "Salary"});
//            while (rs.next()) {
//                writer.writeNext(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
//            }
//        }
//        conn.close();
//    }
//}


//using sqlite
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.*;

public class ExportDBToCSV {
    public static void main(String[] args) {
        // Set database path inside openCSV/src/main/resources/
        String dbPath = "openCSV/src/main/resources/employees.db";
        String url = "jdbc:sqlite:" + dbPath;

        try {
            // Ensure the directory exists
            File dbFile = new File(dbPath);
            dbFile.getParentFile().mkdirs(); // Create directories if not exist

            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();

            // Create employees table if it doesn't exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employees (" +
                    "id INTEGER PRIMARY KEY, " +
                    "name TEXT, " +
                    "department TEXT, " +
                    "salary REAL)";
            stmt.execute(createTableSQL);

            // Insert sample data if not already present
            String insertDataSQL = "INSERT INTO employees (id, name, department, salary) VALUES " +
                    "(1, 'John Doe', 'IT', 50000.0), " +
                    "(2, 'Jane Smith', 'HR', 55000.0), " +
                    "(3, 'Alice Brown', 'Finance', 60000.0) " +
                    "ON CONFLICT(id) DO NOTHING";
            stmt.executeUpdate(insertDataSQL);

            // Export data to CSV
            exportToCSV(conn);

            System.out.println("Database and CSV export completed successfully!");

            conn.close(); // Close connection
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void exportToCSV(Connection conn) throws Exception {
        String query = "SELECT * FROM employees";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             CSVWriter writer = new CSVWriter(new FileWriter("openCSV/src/main/resources/employees_report.csv"))) {

            // Write CSV headers
            writer.writeNext(new String[]{"Employee ID", "Name", "Department", "Salary"});

            // Write rows from database
            while (rs.next()) {
                writer.writeNext(new String[]{
                        String.valueOf(rs.getInt("id")),
                        rs.getString("name"),
                        rs.getString("department"),
                        String.valueOf(rs.getDouble("salary"))
                });
            }
        }
    }
}

