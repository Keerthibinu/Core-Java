package CollectionFramework;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("tai");
        h.add("hello");
        h.add("low");
        h.add("are");
        System.out.println("HashSet: " + h);

        TreeSet<String> t = new TreeSet<>();
        t.add("tai");
        t.add("hello");
        t.add("low");
        t.add("are");
        System.out.println("TreeSet: " + t);

        Integer[] ar = {1,2,3,4,5,6};
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set, ar);
        System.out.println(set);

        ArrayList<String> al = new ArrayList<>(h);
        Collections.sort(al);
        System.out.println("Sorted HashSet" + al);
    }
}
