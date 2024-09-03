package JDBC_Demo;

import java.sql.*;

public class Select {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/demo";
        String uname = "root";
        String pass = "root";
        String query = "select * from student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
            String userData = rs.getInt(1) + " : " + rs.getString(2);
            System.out.println(userData);
        }
        st.close();
        con.close();
    }
}
