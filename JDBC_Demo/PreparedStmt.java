package JDBC_Demo;

import java.sql.*;
public class PreparedStmt {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
        int userid = 6;
        String name = "Joe";
        String query = "insert into student values(?,?)";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(1, userid);
        stmt.setString(2, name);
        int m = stmt.executeUpdate( );
        System.out.println("Rows affected: " + m);
        ResultSet rs = stmt.executeQuery("select * from student");
        while(rs.next()){
            String data = rs.getInt(1) + " : " + rs.getString(2);
            System.out.println(data);
        }
        stmt.close();
        con.close();
    }
}
