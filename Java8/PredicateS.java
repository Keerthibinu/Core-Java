package Java8;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class PredicateS {
    public static void main(String[] args) {
        Predicate<Integer> p = I->(I>10);
        System.out.println(p.test(5));
        System.out.println(p.test(60));

        Predicate<String> p1 = I->(I.length()>3);
        System.out.println(p1.test("Hello"));
        System.out.println(p1.test("He"));

        Predicate<Collection> p2 = I-> I.isEmpty();
        System.out.println(p2.test(Collections.singleton(new int[]{1, 2, 3})));

        Integer[] ints = {0,1,2,3,4,5,6,7,8};
        Predicate<Integer> pr1 = i -> i%2==0;
        Predicate<Integer> pr2 = i -> i>2;
        method(pr1.and(pr2),ints);
    }

    public static void method(Predicate<Integer> p, Integer[] ar) {
        for(Integer i:ar) {
            if(p.test(i))
                System.out.println(i);
        }
    }
}
