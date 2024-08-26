package JavaBasics;

import java.util.Arrays;

public class LargeSmallString {
    public static void main(String[] args) {
        String line = "Hi this is Keerthi Binu";
        String[] arr = line.split(" ");
        System.out.println(Arrays.toString(arr));
        String max=arr[0];
        String min=arr[0];
        for(String s : arr){
            if(max.length()<s.length()){
                max=s;
            }
            if(min.length()>s.length()){
                min=s;
            }
        }
        System.out.println(max+" "+min);
    }
}