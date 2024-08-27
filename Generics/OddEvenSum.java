package Generics;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSum {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>(List.of(1,2,3,4));
        ArrayList<Double> doubles = new ArrayList<Double>(List.of(1.1,2.0,6.0,2.2,3.3,4.4));
        sumofnumbers(integers);
        sumofnumbers(doubles);
    }
    public static <T extends Number> void sumofnumbers(ArrayList<T> list){
        double evensum = 0;
        double oddsum = 0;
        for(T t:list) {
            if(t.doubleValue()%2==0)
                evensum+=t.doubleValue();
            else
                oddsum+=t.doubleValue();
        }
        System.out.println("Even Sum: " + evensum);
        System.out.println("Odd Sum: " + oddsum);
    }
}
