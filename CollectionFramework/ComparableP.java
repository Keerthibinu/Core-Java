package CollectionFramework;

import java.util.*;

public class ComparableP {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Keerthi",12));
        students.add(new Student("Kiran",12));
        students.add(new Student("Binu",2));
        students.add(new Student("Sisi",32));
        students.add(new Student("Leena",22));
        System.out.println(students);
        System.out.println("Before Sorting");
        for(Student i:students){
            System.out.println(i.name + " " + i.age);
        }
        System.out.println("\nAfter Sorting");
        Collections.sort(students);
        for(Student i:students){
            System.out.println(i.name + " " + i.age);
        }
    }

}

class Student implements Comparable<Student> {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(o.age==this.age)
            return 0;
        else if(o.age < this.age)
            return 1;
        else
            return -1;
    }
}
