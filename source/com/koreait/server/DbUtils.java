package com.koreait.server;

import java.sql.*;

public class DbUtils {

    public static Connection getCon() throws SQLException, ClassNotFoundException {
        final  String URL = "jdbc:mysql://localhost:3308/test";
        final String USERNAME = "root";
        final String PASSWORD = "koreait";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        System.out.println("접속 성공");
        return con;
    }

    public static void  close(Connection con, PreparedStatement ps){

    }

    public static void close(Connection con,PreparedStatement ps, ResultSet rs){

    }
}

