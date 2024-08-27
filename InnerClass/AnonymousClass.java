package InnerClass;

public class AnonymousClass {
    static Hello h = new Hello() {
        void hai() {
            super.hai();
            System.out.println("Anonymous Hello");
        }
    };
    public static void main(String[] args) {
        h.hai();
    }
}

class Hello {
    void hai() {
        System.out.println("Hai Hello");
    }
}
