package JavaBasics;

import java.util.Arrays;

public class DivideString {
    public static void main(String[] args) {
        String s = "aaabbbccc";
        int len=3,i=0,j=0;
        String[] ar=new String[s.length()/len];
        while(i<s.length()){
            String ele=s.substring(i,i+len);
            i+=3;
            ar[j++]=ele;
        }
        System.out.println(Arrays.toString(ar));
    }
}
