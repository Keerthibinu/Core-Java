package InnerClass;

public class AnonymousInterface {
    static Helloo h = new Helloo() {
        public void hai() {
            System.out.println("Anonymous Hello");
        }
    };
    public static void main(String[] args) {
        h.hai();
    }
}

interface Helloo {
    void hai();
}
