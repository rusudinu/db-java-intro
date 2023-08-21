package org.example.jdbc;

import java.sql.*;

public class Main {

    private static final String connectionUrl = "jdbc:mysql://localhost:3306/my_sql_demo";
    private static final String username = "root";
    private static final String password = "topsecretpassword";
    private static Connection connection;

    public static void main(String[] args) throws SQLException {

        try {
            connection = DriverManager.getConnection(connectionUrl, username, password);

            getAllToys();
            insertToy("Mickey Mouse", 10);
            insertToy("Mickey Mouse 2", 20);
            insertToy("Mickey Mouse 3", 30);
            getToy(1);
            
            deleteToy(3);
            getAllToys();

        } finally {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    private static void getAllToys() throws SQLException {
        Statement ps = connection.createStatement();
        ResultSet rs = ps.executeQuery("SELECT * FROM toys");
        while (rs.next()) {
            Toy c = new Toy(rs.getString("name"), rs.getInt("stock"));
            System.out.println(c);
        }
    }

    private static void insertToy(String name, int stock) throws SQLException {
        PreparedStatement ps2 = connection.prepareStatement("INSERT INTO `toys` (`name`, `stock`) VALUES ( ?, ?);");
        ps2.setString(1, name);
        ps2.setInt(2, stock);
        ps2.execute();
    }

    private static void getToy(int id) throws SQLException {
        PreparedStatement ps3 = connection.prepareStatement("SELECT * FROM toys WHERE id = ?");
        ps3.setInt(1, id);
        ResultSet rs2 = ps3.executeQuery();
        while (rs2.next()) {
            Toy c = new Toy(rs2.getString("name"), rs2.getInt("stock"));
            System.out.println(c);
        }
    }

    private static void updateToy(int id, int stock) throws SQLException {
        PreparedStatement ps4 = connection.prepareStatement("UPDATE toys SET stock = ? WHERE id = ?");
        ps4.setInt(1, stock);
        ps4.setInt(2, id);
        ps4.execute();
    }

    private static void deleteToy(int id) throws SQLException {
        PreparedStatement ps5 = connection.prepareStatement("DELETE FROM toys WHERE id = ?");
        ps5.setInt(1, id);
        ps5.execute();
    }

}
