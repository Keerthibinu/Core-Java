package JDBC_Demo;

import java.sql.*;
public class Insert {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
        int userid = 5;
        String username = "Binu";
        Statement stmt = con.createStatement();
        //int n = stmt.executeUpdate("insert into student values(4,'Sisi')");
        int m = stmt.executeUpdate("insert into student values(" + userid + ",'" + username + "')");
        ResultSet rs = stmt.executeQuery("select * from student");
        System.out.println("Rows affected: " + m);
        while(rs.next()){
            String data = rs.getInt(1) + " : " + rs.getString(2);
            System.out.println(data);
        }
        stmt.close();
        con.close();
    }
}
