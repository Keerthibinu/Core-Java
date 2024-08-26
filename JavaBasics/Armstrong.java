package JavaBasics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int n=a.length();
        int val=0;
        for(int i=0;i<n;i++){
            val+=Math.pow(Integer.parseInt(String.valueOf(a.charAt(i))),n);
        }
        if(val==Integer.parseInt(a))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
