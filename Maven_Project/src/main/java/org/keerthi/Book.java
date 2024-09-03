package org.keerthi;

import java.sql.*;
import java.util.*;

public class Book {
    private final Connection con;
    private final Scanner sc;

    Book() throws Exception {
        sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
    }

    public void addBook() throws SQLException {
        String query = "insert into book_details(bookName,authorName) values(?,?)";
        PreparedStatement st = con.prepareStatement(query);
        System.out.println("Enter book name: ");
        String bookName=sc.nextLine();
        System.out.println("Enter author name: ");
        String authorName=sc.nextLine();
        st.setString(1,bookName);
        st.setString(2,authorName);
        st.executeUpdate();
        System.out.println("\nBook " + bookName + " added.\n");
    }

    public void showBook() throws SQLException {
        Statement ps = con.createStatement();
        ResultSet rs = ps.executeQuery("select * from book_details");
        System.out.println("\nBook Name\t\tAuthor\t\tBorrowed\t\tBorrower");
        while(rs.next()) {
            System.out.println(rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4) + "\t\t" + rs.getString(5));
        }
    }

    public void borrowBook() throws SQLException {
        System.out.println("Enter your name: ");
        String borrowerName = sc.nextLine();
        Statement ps = con.createStatement();
        ResultSet rs = ps.executeQuery("SELECT bookName FROM book_details WHERE isBorrowed = false");
        ArrayList<String> bookNamelist = new ArrayList<String>();
        while (rs.next()) {
            bookNamelist.add(rs.getString(1));
        }
        while(true) {
            System.out.println("\nAvailable books are listed below:");
            for(String i:bookNamelist)
                System.out.println(i);
            System.out.println("\nEnter book name: ");
            String bookName = sc.nextLine();
            if (bookNamelist.contains(bookName)) {
                String query = "update book_details set isBorrowed = True, borrowerName = ? where bookName= ?";
                PreparedStatement st = con.prepareStatement(query);
                st.setString(1, borrowerName);
                st.setString(2, bookName);
                st.executeUpdate();
                System.out.println("\nBook " + bookName + " borrowed by " + borrowerName + "\n");
                break;
            } else {
                System.out.println("Book not available. Please choose from the available books.");
            }
        }
    }
}