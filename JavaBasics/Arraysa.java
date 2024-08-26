
import java.util.Arrays;

public class Arraysa {
    public static void main(String[] args) throws Exception {
        int[] arr={1,2,3,5,1,1,6,6,6,6,3,4,5};
        for (int j : arr) {
            int cnt = 0;
            for (int k : arr) {
                if (j == k) {
                    cnt += 1;
                }
            }
            System.out.println(j + " " + cnt);
            Arrays.sort(arr);
        }
        for (int k : arr) System.out.println(k);
    }

}
