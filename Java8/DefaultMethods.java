package Java8;

interface AB{
    default void methodAB() {
        System.out.println("AB");
    }
}

interface CD{
    default void methodCD() {
        System.out.println("CD");
    }
}

public class DefaultMethods implements AB,CD {
    public static void main(String[] args) {
        DefaultMethods dm = new DefaultMethods();
        dm.methodAB();
        dm.methodCD();
    }
}


