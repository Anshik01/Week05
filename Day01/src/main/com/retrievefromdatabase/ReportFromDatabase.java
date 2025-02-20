package com.retrievefromdatabase;

import java.sql.*;
import java.io.FileWriter;
import java.io.IOException;

public class ReportFromDatabase {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/employee"; // Update database details
        String dbUser = "root";
        String dbPassword = "ashu";
        String csvFilePath = "file.csv"; // Output CSV file

        String query = "SELECT id, name, salary FROM info";

        try (Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query);
             FileWriter csvWriter = new FileWriter(csvFilePath)) {

            // Writing CSV Headers
            csvWriter.append("id,name,salary\n");

            // Writing Data Rows
            while (resultSet.next()) {
                csvWriter.append(resultSet.getInt("id") + ",");
                csvWriter.append(resultSet.getString("name") + ",");
                csvWriter.append(resultSet.getDouble("salary") + "\n");
            }

            System.out.println("CSV file generated successfully: " + csvFilePath);

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
