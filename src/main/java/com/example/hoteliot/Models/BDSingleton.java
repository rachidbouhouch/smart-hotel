package com.example.hoteliot.Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDSingleton {
    private static Connection conn ;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel-intelligent" , "root","");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();}

    }

    public static Connection getConn() {
        return conn;
    }
}
