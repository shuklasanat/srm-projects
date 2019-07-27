package com.hello.company;
import java.sql.*;
import java.lang.*;

public class connect {

    public connect() {

        String url = "jdbc:mysql://localhost:33060/shukladb?useSSL=false";
        String user = "root";
        String password = "sanat";
        Class.forName("com.mysql.jdbc.Driver");
        Connection mycon = DriverManager.getConnection(url, user, password);
        Statement st = mycon.createStatement();
        ResultSet hi = st.executeQuery("describe sanat");
        hi.next();
        String table = hi.getString("NAME");


    }

}

