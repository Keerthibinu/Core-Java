import java.util.*;

public class Calculator 
{
	Scanner sc = new Scanner(System.in);
	public void addition() 
	{
        		System.out.println("Enter two numbers to add:");
        		int a = sc.nextInt();
       		int b = sc.nextInt();
        		System.out.println("Sum: " + (a + b));
	}

	public void subtraction() 
	{
        		System.out.println("Enter two numbers to subtract:");
        		int a = sc.nextInt();
        		int b = sc.nextInt();
        		System.out.println("Difference: " + (a - b));
    	}

    	public void multiplication() 
	{
        		System.out.println("Enter two numbers to multiply:");
        		int a = sc.nextInt();
        		int b = sc.nextInt();
        		System.out.println("Product: " + (a * b));
   	}
    
	public void division() throws DivisionError 
	{
        		System.out.println("Enter two numbers to divide:");
        		int a = sc.nextInt();
        		int b = sc.nextInt();
		do{
			try{
				if (b == 0) 
           	 				throw new DivisionError("Division by zero is not allowed.Enter another value.");
			}
			catch(DivisionError dr)
			{
				System.out.println(dr.getMessage());
				b=sc.nextInt();
			}
		}while(b==0);
		System.out.println("Quotient: " + ((float) a / b));
	}
}
