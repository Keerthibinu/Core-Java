package JDBC_Demo.Login_Registration;

import JDBC_Demo.PreparedStmt;

import java.util.*;
import java.sql.*;

public class Project {
    private static final String url = "jdbc:mysql://localhost:3306/lr";
    private static final String user = "root";
    private static final String pass = "root";
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=0;
        do{
            System.out.println("1.New here? Register\n2.Have an account? Login\n3.Exit\nEnter option: ");
            int option = sc.nextInt();
            switch(option){
                case 1: register();
                        break;
                case 2: n = login();
                        break;
                case 3: System.out.println("Exiting");
                        return;
                default:System.out.println("Invalid option");
            }
        }while(n==0);
    }
    public static void register() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,user,pass);
        String query = "insert into details(username,name,password) values(?,?,?)";
        PreparedStatement st = con.prepareStatement(query);
        System.out.println("Enter name: ");
        String name=sc.nextLine();
        System.out.println("Enter username: ");
        String username=sc.nextLine();
        System.out.println("Enter password: ");
        String password=sc.nextLine();
        st.setString(1,username);
        st.setString(2,name);
        st.setString(3,password);
        st.executeUpdate();
    }

    public static int login() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,user,pass);
        System.out.println("Enter username: ");
        String username=sc.nextLine();
        System.out.println("Enter password: ");
        String password=sc.nextLine();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM details WHERE username = ?");
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        if(rs.next() && Objects.equals(rs.getString(2), username) && Objects.equals(rs.getString(4), password)) {
            System.out.println("Login Successful.\nWelcome " + rs.getString(3));
            return 1;
        }
        else {
            System.out.println("Login Failed. Try again.");
            return 0;
        }
    }
}
