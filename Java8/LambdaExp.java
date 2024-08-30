package Java8;

import java.util.ArrayList;

public class LambdaExp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.forEach((n)->{System.out.println(n);});
        list.forEach((n)->{list1.add(n+2);});
        System.out.println(list1);
    }
}
