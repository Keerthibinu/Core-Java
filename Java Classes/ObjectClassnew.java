public class ObjectClassnew {
    public static void main(String[] args) {
        Person p = new Person("Keerthi",21);
        System.out.println(p.hashCode());
        System.out.println(p.toString());
        Person p1 = new Person("Keerthi",21);
        System.out.println(p1.hashCode());
        System.out.println(p1.toString());
        System.out.println(p.equals(p1));
    }
}

class Person{
    private String name;
    private int age;
    static int count=1;
    int num;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode(){
        num=count++;
        return num;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\n"+"Age: " + age;
    }


    public boolean equals(Object o){
        Person p2 = (Person)o;
        return p2.name.equals(this.name) && p2.age == this.age;
    }
}
