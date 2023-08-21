package org.example.jdbc;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String connectionUrl = "jdbc:mysql://localhost:3306/my_sql_demo";
        String username = "root";
        String password = "topsecretpassword";

        Connection connection = DriverManager.getConnection(connectionUrl, username, password);
        Statement ps = connection.createStatement();
        ResultSet rs = ps.executeQuery("SELECT * FROM toys");
        while (rs.next()) {
            Toy c = new Toy(rs.getString("name"), rs.getInt("stock"));
            System.out.println(c);
        }

        PreparedStatement ps2 = connection.prepareStatement("INSERT INTO `toys` (`name`, `stock`) VALUES ( ?, ?);");
        ps2.setString(1, "Mickey Mouse");
        ps2.setInt(2, 10);
        ps2.execute();
    }
}
