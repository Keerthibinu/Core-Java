import java.sql.*;

public class LoginDao {
    public boolean check(String uname, String password) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lr","root","root");
        PreparedStatement st = con.prepareStatement("select * from login where username=? and password=?");
        st.setString(1,uname);
        st.setString(2,password);
        ResultSet rs = st.executeQuery();
        return rs.next();
    }
}
