package JavaBasics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int ele = sc.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a+ " ");
        System.out.print(b+ " ");
        for(int i=2;i<ele;i++){
            c=a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }
    }
}
