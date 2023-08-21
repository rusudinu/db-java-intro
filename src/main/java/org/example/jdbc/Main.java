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
        // TODO IMPLEMENT
    }

    private static void updateToy(int id, int stock) throws SQLException {
        // TODO IMPLEMENT
    }

    private static void deleteToy(int id) throws SQLException {
        // TODO IMPLEMENT
    }

}
