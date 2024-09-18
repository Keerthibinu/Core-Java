import java.util.*;

public class Main {
	public static void main(String[] args)  throws DivisionError {
        		int op;
        		Scanner sc = new Scanner(System.in);
        		Calculator cal = new Calculator();
        		do {
            			System.out.println("\n\nMENU\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n\nEnter operation");
            			op = sc.nextInt();
			switch(op) {
                				case 1:	cal.addition();
                    					break;
                				case 2:	cal.subtraction();
                    					break;
                				case 3:	cal.multiplication();
                    					break;
                				case 4:	cal.division();
                    					break;
                				case 5:	System.out.println("Exiting from Calculator.");
                    					return;
                				default:	System.out.println("Enter a valid option.");
                    					break;
            			}
       		} while(op != 5);
    	}
}
