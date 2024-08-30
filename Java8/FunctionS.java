package Java8;

import java.util.function.Function;

public class FunctionS {
    public static void main(String[] args) {
        Function<String, Integer> f = i->i.length();
        System.out.println(f.apply("123"));
        System.out.println(f.apply("Keerthi"));
    }
}
