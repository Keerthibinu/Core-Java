package Generics;

import java.util.ArrayList;
import java.util.List;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Double> doubs = new ArrayList<>(List.of(1.1, 2.2, 3.3, 4.4));
        findelement(ints, 3);
        findelement(doubs, 4);
    }
    public static <T extends Number> void findelement(ArrayList<T> list,int ele) {
        for(T val:list) {
            if(val.doubleValue() == (double)ele) {
                System.out.println("Found " + val + " : " + list.indexOf(val));
                return;
            }
        }
        System.out.println("Not found " + ele + ": -1");
    }
}


