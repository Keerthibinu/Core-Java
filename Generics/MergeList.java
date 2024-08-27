package Generics;

import java.util.ArrayList;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1,2,3,4));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(4,3,2,1));
        mergelist(arr1,arr2);
    }
    public static <T extends Number> void mergelist(ArrayList<T> arr1, ArrayList<T> arr2) {
        ArrayList<Integer> arr3 = new ArrayList<>();
        for(T i:arr1) {
            arr3.add((Integer) i);
        }
        for(T i:arr2) {
            arr3.add((Integer) i);
        }
        System.out.println(arr3);
    }
}
