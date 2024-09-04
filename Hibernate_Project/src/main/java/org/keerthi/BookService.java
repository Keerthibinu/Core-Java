package org.keerthi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.sql.*;
import java.util.*;

public class BookService {
    private final Scanner sc;
    private final SessionFactory sf;

    public BookService(){
        sf =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        sc = new Scanner(System.in);
    }

    public void addBook() throws SQLException {
        System.out.println("Enter book name: ");
        String bookName=sc.nextLine();
        System.out.println("Enter author name: ");
        String authorName=sc.nextLine();
        Book book=new Book(bookName, authorName, false, null);

        Session session= sf.openSession();
        Transaction tx=session.beginTransaction();
        session.persist(book);
        tx.commit();
        session.close();
        System.out.println("\nBook " + bookName + " added.\n");
    }

    public void showBook() throws SQLException {
        Session session= sf.openSession();
        Query query = session.createQuery("From Book");

        System.out.println("\nBook\tAuthor\tBorrowed\tBorrower");
        List<Book> bookDetails=query.list();
        bookDetails.forEach(System.out::println);
        session.close();
    }

    public void borrowBook() throws SQLException {
        Session session= sf.openSession();
        Transaction tx=session.beginTransaction();
        Query query = session.createQuery("select title From Book");

        List<String> bookNameList = query.list();
        System.out.println("Enter your name: ");
        String borrowerName = sc.nextLine();
        while(true) {
            System.out.println("\nAvailable books are listed below:");
            bookNameList.forEach(System.out::println);
            System.out.println("\nEnter book name: ");
            String bookName = sc.nextLine();

            if (bookNameList.contains(bookName)) {
                Query updateQuery = session.createQuery("update Book set isBorrowed = true, Borrower = :Borrower where title = :Title");
                updateQuery.setParameter("Borrower", borrowerName);
                updateQuery.setParameter("Title", bookName);
                updateQuery.executeUpdate();
                System.out.println("\nBook " + bookName + " borrowed by " + borrowerName + "\n");
                break;
            } else {
                System.out.println("Book not available. Please choose from the available books.");
            }
        }
        tx.commit();
        session.close();
    }
}