package CollectionFramework;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.add(1,10);
        list.add(3,20);
        list.add(5,30);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
