package com.yohannes.jdbc.example;

import java.sql.*;

public class Example {

    public static void main(String[] args) throws SQLException {
        String sql = "select name from product where id = 1";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usernmae = "postgres";
        String passowrd = "1234";
        Connection con = DriverManager.getConnection(url,usernmae,passowrd);
        Statement st = con.createStatement();
        ResultSet resultSet = st.executeQuery(sql);
        resultSet.next();
        String name = resultSet.getString(1);
        System.out.println(name);
        con.close();
    }
}
