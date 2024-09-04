package org.keerthi;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int option;
        Scanner sc = new Scanner(System.in);
        BookService bookService = new BookService();
        do{
            System.out.println("\n\nMENU\n1.Add Book\n2.Show Book\n3.Borrow Book\n4.Exit\nEnter option: ");
            option = sc.nextInt();
            switch(option){
                case 1: bookService.addBook();
                        break;
                case 2: bookService.showBook();
                        break;
                case 3: bookService.borrowBook();
                        break;
                case 4: System.out.println("Exiting");
                        return;
                default:System.out.println("Invalid option");
            }
        }while(option!=4);
    }
}