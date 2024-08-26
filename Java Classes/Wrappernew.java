import java.util.Arrays;
import java.util.Scanner;

public class Wrappernew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] ele = new Integer[10];
        System.out.println("Enter array: ");
        for (int i=0;i<10;i++) {
            ele[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ele));
        int max=0;
        int min=100;
        int sum=0;
        for(int i:ele){
            sum+=i;
            if(i>max){
                max=i;
            } else if (i<min) {
                min=i;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
