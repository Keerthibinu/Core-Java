public class ObjectClass {
    public static void main(String[] args){
        Student s1=new Student("Keerthi",21,70);
        System.out.println(s1);//Without toString method will return Student@cac736f
        System.out.println(s1.toString());//Keerthi 21 70
        System.out.println(s1.hashCode());
        Student s2=new Student("Kiran",23,80);
        System.out.println(s2.hashCode());
        Student s3=s1;
        System.out.println(s1.equals(s3));//true
        System.out.println(s1==s3);//true
        Student s4=new Student("Keerthi",21,70);
        System.out.println(s1.equals(s4));//false -- but with equals method overridding return true
        System.out.println(s1==s4);//false
        System.out.println(s1.getClass());//class Student
        System.out.println(s1.getClass().getName());//Student
        s1=null;
        System.gc();//calls finalize and clears garbage
        System.out.println(s1);//null
    }
}

class Student{
    String name;
    int age;
    int mark;
    static int count=0;
    int rollno;
    Student(String sname,int sage,int smark){
        this.name=sname;
        this.age=sage;
        this.rollno=++count;
    }

    public String toString(){
        return this.name + " " + this.age + " " + this.mark;
    }

    public int hashCode(){
        return rollno;
    }

    public boolean equals(Object o) {
        if(this==o)
            return true;
        if(o instanceof Student) {
            Student s2=(Student)o;
            return name.equals(s2.name) && mark == s2.mark && age == s2.age;
        }
        return false;
    }

}
