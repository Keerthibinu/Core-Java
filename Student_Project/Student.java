import java.util.*;
class Student
{
    	private int rollno;
    	private String name;
    	Scanner sc = new Scanner(System.in);
    	Subject[] subs = new Subject[3];
    	ArrayList<Individual> studs = new ArrayList<>();
    	public void addStudent()
    	{
    	 	System.out.println("Enter student rollno: ");
        		rollno = sc.nextInt();
        		sc.nextLine();
        		System.out.println("Enter student name: ");
        		name=sc.nextLine();
        		for(int i=0;i<3;i++)
        		{
            			System.out.println("Enter subject name: ");
            			String name=sc.nextLine();
            			System.out.println("Enter subject marks: ");
            			float mark=sc.nextFloat();
            			subs[i]=new Subject(name,mark);
            			sc.nextLine();
        		}
        		studs.add(new Individual(rollno,name,subs));
    	}

    	public void showStudents()
    	{
        		System.out.println("\nRollNo\tName\tAvg Mark");
		studs.stream().forEach((stud)->{System.out.println(stud.rollno + "\t" + stud.name + "\t" + stud.average) ;});
    	}

    	public void getClassAverage()
    	{
        		double total_avg = studs.stream().mapToDouble(stud -> stud.average).sum();
        		System.out.println("\nClass Average: " + total_avg/studs.size());
    	}
}

class Individual{
	int rollno;
    	String name;
	float average=0.0f;
    	Subject[] subs = new Subject[3];
    	Individual(int rollno,String name, Subject[] subs)
    	{
    	 	this.rollno=rollno;
		this.name=name;
        		this.subs=subs;
		for(int j=0;j<3;j++)
            			this.average+=subs[j].marks;
		this.average/=3;
    	}
}

class Subject{
    	String sub_name;
    	float marks;
    	Subject(String name, float marks){
        		this.sub_name=name;
        		this.marks=marks;
    	}
}