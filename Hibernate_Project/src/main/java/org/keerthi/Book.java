package org.keerthi;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;
    private String Borrower;

    public Book(String title, String author, boolean isBorrowed, String borrower) {
        Borrower = borrower;
        this.isBorrowed = isBorrowed;
        this.author = author;
        this.title = title;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getBorrower() {
        return Borrower;
    }

    public void setBorrower(String borrower) {
        Borrower = borrower;
    }

    @Override
    public String toString() {
        return title + "\t" + author + "\t" + isBorrowed + "\t" + Borrower;
    }

}
