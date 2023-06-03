import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDB {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://DESKTOP-P1PUL4V\\SQLEXPRESS02;databaseName=StudentsDB;integratedSecurity=true;authenticationScheme=nativeAuthentication";

        try (Connection connection = DriverManager.getConnection(url)) {
            String month = "03"; // Пошук студентів, які народилися в обраному місяці
            String query = "SELECT * FROM Students WHERE MONTH(Birth_Date) = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, month);
                ResultSet resultSet = statement.executeQuery();

                // resultSet.next();

                while (resultSet.next()) {
                    String lastName = resultSet.getString("Last_Name");
                    String firstName = resultSet.getString("First_Name");
                    String middleName = resultSet.getString("Middle_Name");
                    Date birthDate = resultSet.getDate("Birth_Date");
                    String studentID = resultSet.getString("Student_ID");
                    int id = resultSet.getInt("ID");

                    System.out.println("Last Name: " + lastName);
                    System.out.println("First Name: " + firstName);
                    System.out.println("Middle Name: " + middleName);
                    System.out.println("Birth Date: " + birthDate);
                    System.out.println("Student ID: " + studentID);
                    System.out.println("ID: " + id);
                    System.out.println("--------------------");
                }
                resultSet.close();
                statement.close();
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}