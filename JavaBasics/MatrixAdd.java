package JavaBasics;
import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int rows=sc.nextInt();
        int column=sc.nextInt();
        System.out.println("Enter matrix");
        int[][] matrix=new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                sum+=matrix[i][j];
            }
        }
        System.out.println("Sum is: "+sum);
    }
}
