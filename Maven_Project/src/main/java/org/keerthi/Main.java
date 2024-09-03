package org.keerthi;

import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int option;
        Scanner sc = new Scanner(System.in);
        Book bk = new Book();
        do{
            System.out.println("\n\nMENU\n1.Add Book\n2.Show Book\n3.Borrow Book\n4.Exit\nEnter option: ");
            option = sc.nextInt();
            switch(option){
                case 1: bk.addBook();
                        break;
                case 2: bk.showBook();
                        break;
                case 3: bk.borrowBook();
                        break;
                case 4: System.out.println("Exiting");
                        return;
                default:System.out.println("Invalid option");
            }
        }while(option!=4);
    }
}