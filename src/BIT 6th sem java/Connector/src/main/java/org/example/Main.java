package org.example;
import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/java";

        // connect to database
        Connection conn = DriverManager.getConnection(url, "root", "");
        System.out.println("Connection Success");

        // Insert data int db
//        Statement statement = conn.createStatement();
//        statement.executeUpdate("INSERT INTO connector (id, name, email, gender, contact) VALUES(2, 'Ankit', 'ankit@gmail.com', 'male', '9846900168')");
//        ResultSet resultSet = statement.executeQuery("SELECT * from connector");

        // fetch data from db
//        Statement statement = conn.createStatement();
//        ResultSet resultSet = statement.executeQuery("SELECT * from connector");
//        System.out.println(resultSet);

        // Update data into table
        Statement statement = conn.createStatement();
        statement.executeUpdate("UPDATE connector SET name = 'Puspa', email = 'puspa@gmail.com', gender = 'female', contact = '9817173790' WHERE id = 1");
        ResultSet resultSet = statement.executeQuery("SELECT * from connector");

        // Prepared Statement
//        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * from connector WHERE id=? OR name=?");
//        preparedStatement.setInt(1, 2);
//        preparedStatement.setString(2, "Ankit");
//        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            System.out.println(resultSet.getInt("id") + " ");
            System.out.println(resultSet.getString("name"));
            System.out.println(" ");
            System.out.println(resultSet.getString("email"));
            System.out.println(" ");
            System.out.println(resultSet.getString("gender"));
            System.out.println(" ");
            System.out.println(resultSet.getString("contact"));
            System.out.println(" ");
        }
    }
}