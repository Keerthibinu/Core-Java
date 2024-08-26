package JavaBasics;

public class LargestOf3 {
    public static void main(String[] args) {
        int i=5,j=10,k=6;
        System.out.println((i>j)?((i>k)?i:k):((j>k)?j:k));
        System.out.println((i<j)?((i<k)?i:k):((j<k)?j:k));
    }
}


