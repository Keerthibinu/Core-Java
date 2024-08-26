package CollectionFramework;

import java.util.*;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Iterator iterator = q.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        q.clear();
        if(q.peek()==null)
            System.out.println("Empty");
    }

}
