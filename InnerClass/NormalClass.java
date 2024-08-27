package InnerClass;

public class NormalClass {
    int i=20;
    String l="hello";
    class InnerClass {
        int i=10;
        String h="hai";
    }
    public static void main(String[] args) {
        NormalClass nc = new NormalClass();
        InnerClass ic = nc.new InnerClass();
        System.out.println(nc.i);
        System.out.println(nc.l);
        System.out.println(ic.i);
        System.out.println(ic.h);
    }
}
