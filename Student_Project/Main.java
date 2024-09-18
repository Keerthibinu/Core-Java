import java.util.*;

public class Main1 {
	public static void main(String[] args)  {
        		int op;
        		Scanner sc = new Scanner(System.in);
				Student st = new Student();
        		do {
            			System.out.println("\n\nMENU\n1.Add Student\n2.Show Students\n3.Get Class Average\n4.Exit\n\nEnter operation");
            			op = sc.nextInt();
			switch(op) {
                				case 1:	st.addStudent();
                    					break;
                				case 2:	st.showStudents();
                    					break;
                				case 3:	st.getClassAverage();
                    					break;
                				case 4:	System.out.println("Exiting.");
                    					return;
                				default:	System.out.println("Enter a valid option.");
                    					break;
            			}
       		} while(op != 4);
    	}
}
