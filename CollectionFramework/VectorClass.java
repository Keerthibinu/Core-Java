package CollectionFramework;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>();
        v.add(0);
        v.add(5);
        v.add(10);
        v.add(15);
        v.add(20);
        int n = Collections.max(v);
        System.out.println("Maximum Element: " + n);
        char ch;
        do{
            System.out.print("Enter element to search: ");
            Scanner sc = new Scanner(System.in);
            int ele = sc.nextInt();
            for (int i : v) {
                if (i == ele) {
                    System.out.println(ele + " is found");
                    return;
                }
            }
            System.out.println("Element not found");
            System.out.println("Continue Search for another element? Press Y else click N");
            ch = sc.next().charAt(0);
        }while(ch=='Y');
    }
}
