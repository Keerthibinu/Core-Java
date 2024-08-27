package InnerClass;

class Outer {
    public void methodOuter(){
        System.out.println("Method Outer");
        class Inner {
            public void methodInner(){
                System.out.println("Method Inner");
            }
        }
        Inner i = new Inner();
        i.methodInner();
    }
}

public class MethodLocalClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.methodOuter();
    }
}
