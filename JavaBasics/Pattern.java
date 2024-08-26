package JavaBasics;

public class Pattern {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=5;j>0;j--){
                if(j-1==i)
                    System.out.print("* ");
                else
                    System.out.print(j+" ");
            }
            System.out.println();
        }
        numberPattern();
        xPattern();
        squarePattern();
    }
    public static void numberPattern(){
        int num=1;
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.print((num*j)+" ");
            }
            num+=1;
            System.out.println();
        }
    }
    public static void xPattern(){
        int num=8,k=1;
        for(int i=1;i<8;i++){
            for(int j=0;j<10;j++){
                if(num==i+j || i-j==0)
                    System.out.print(k+ " ");
                else
                    System.out.print(" ");
            }
            if(i<4)
                k++;
            else
                k--;
            System.out.println();
        }
    }
    public static void squarePattern(){
        int num=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==0){
                    System.out.print(num+" ");
                    num+=1;
                }
                else if(i==5){
                    System.out.print(num+" ");
                    num-=1;
                } else if (j==5) {
                    
                }

            }
        }
    }
}
