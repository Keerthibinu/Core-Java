package Java8;

@FunctionalInterface
interface Inter {
    public void add(int a, int b);
}

@FunctionalInterface
interface A extends Inter {
    public void add(int a, int b);
}

public class FunctionalInterf {
    public static void main(String[] args) {
        Inter i = (a,b) -> System.out.println(a+b);
        i.add(10,3);
    }
}
