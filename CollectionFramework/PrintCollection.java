package CollectionFramework;

import java.util.*;

public class PrintCollection {
    public static void main(String[] args) {
        String[] str = {"Hai", "Hello", "How", "are", "you"};
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, str);
        System.out.println(list);

        //Equal elements in array
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        int max = Collections.max(list1);
        int min = Collections.min(list1);
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
        if(max == min)
            System.out.println("Elements are equal");
        else
            System.out.println("Elements are not equal");

        //Removal of element
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.remove((Integer) 3);
        System.out.println(list2);

        //Size of list
        System.out.println("Length: " + list2.size());
        list2.set(2,7);
        System.out.println(list2);

        //Array into List
        Integer[] arr = {1,2,3,4,5};
        List<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, arr);
        System.out.println(list3);

        //Equal Arrays
        /*
        boolean flag=true;
        if(list1.size()==list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                if (!Objects.equals(list1.get(i), list2.get(i))) {
                    flag = false;
                    break;
                }
            }
        }
        if(flag)
            System.out.println("Equal arrays");
        else
            System.out.println("Not equal arrays");

         */
        if(list1.equals(list2))
            System.out.println("Equal arrays");
        else
            System.out.println("Not equal arrays");

        //Linked list iteration
        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        System.out.println(list4);
        Iterator<Integer> itr = list4.iterator();
        System.out.println("Iterating using iterator:  ");
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Stack
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        System.out.println(st);
        st.add(2,100);
        System.out.println(st);

       
    }
}
