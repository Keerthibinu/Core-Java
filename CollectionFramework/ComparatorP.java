package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorP {
    public static void main(String[] args) {
        ArrayList<Student1> as = new ArrayList<Student1>();
        as.add(new Student1(1,"Kee",12));
        as.add(new Student1(2,"Ali",22));
        as.add(new Student1(3,"Joe",32));
        Collections.sort(as, new NameComparator());
        System.out.println("Sorting based on Name");
        for(Student1 i:as){
            System.out.println(i.name + " " + i.age);
        }
        Collections.sort(as, new AgeComparator());
        System.out.println("\nSorting based on Age");
        for(Student1 i:as){
            System.out.println(i.name + " " + i.age);
        }
    }
}

class Student1 {
    int rollno;
    String name;
    int age;
    Student1(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class NameComparator implements Comparator<Student1> {
    public int compare(Student1 s1, Student1 s2) {
        return s1.name.compareTo(s2.name);
    }
}


class AgeComparator implements Comparator<Student1> {

    public int compare(Student1 s1, Student1 s2) {
        if (s1.age < s2.age)
            return 1;
        else if(s1.age == s2.age)
            return 0;
        else
            return -1;
    }
}
