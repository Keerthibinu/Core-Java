package CollectionFramework;

import java.util.*;

public class Map {
    public static void main(String[] args) {
        //Iterating hashmap
        HashMap<String, String> hm = new HashMap<>();
        hm.put("a", "angular");
        hm.put("p", "python");
        hm.put("c", "c++");
        hm.put("j", "java");
        Set s = hm.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Contains Key
        System.out.println("Key Contains: " + hm.containsKey("a"));

        //Occurrence of words in string
        String str = "My name is Keerthi Binu His name is Kiran Binu";
        ArrayList<String> al=new ArrayList<>(List.of(str.split(" ")));
        System.out.println(str);
        HashMap<String, Integer> hm2 = new HashMap<>();
        for(String ele:al) {
            if(hm2.containsKey(ele))
                hm2.put(ele,hm2.get(ele)+1);
            else
                hm2.put(ele,1);
        }
        System.out.println(hm2);

        //Copy from one map into another
        HashMap<String, Integer> hm3= new HashMap<>();
        hm3.putAll(hm2);
        System.out.println(hm3);

        //Printing duplicate characters
        char[] ch = "Encyclopedia".toCharArray();
        System.out.println(ch);
        HashMap<Character, Integer> hm4 = new HashMap<>();
        for(char ele:ch) {
            if(hm4.containsKey(ele))
                hm4.put(ele,hm4.get(ele)+1);
            else
                hm4.put(ele,1);
        }
        System.out.println(hm4);
        Set s1 = hm4.keySet();
        for(Object ch1: s1) {
            if(hm4.get(ch1)>1) {
                System.out.println(ch1 + ":" + hm4.get(ch1));
            }
        }

        //HashMap to TreeMap
        TreeMap tm = new TreeMap(hm4);
        System.out.println(tm);
    }
}
