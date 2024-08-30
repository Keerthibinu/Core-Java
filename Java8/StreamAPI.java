package Java8;

import java.util.*;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> list1 = list.stream().filter(i->i>5).map(i->i+5).toList();
        System.out.println(list1);
    }

}
