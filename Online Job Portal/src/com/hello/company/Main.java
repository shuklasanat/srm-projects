package com.hello.company;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:33060/shukladb?useSSL=false";
        String user = "root";
        String password = "sanat";
        Class.forName("com.mysql.jdbc.Driver");
        Connection mycon = DriverManager.getConnection(url, user, password);
        Statement st = mycon.createStatement();
        ResultSet hi = st.executeQuery("describe sanat");
        hi.next();
        String table = hi.getString("NAME");

        System.out.println(table);
        st.close();
        mycon.close();

        register r = new register();
       Government g = new Government();
        Private p = new Private();
       // latest l = new latest();
       // admit a = new admit();
       // Qualification q = new Qualification();

        jobs h = new jobs(r,p,g);

    }
}


