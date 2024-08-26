package JavaBasics;

public class nthPrime {
    public static void main(String[] args) {
        int n=10,num=2,cnt=0,j,prime=0;
        while(cnt<n){
            num++;
            for(j=2;j<=num;j++){
                if(num%j==0){
                    break;
                }
            }
            if(j==num){
                cnt++;
                prime=num;
            }
        }

        System.out.println(prime);
        alternateprime();
    }

    public static void alternateprime(){
        int i,j=0,cnt=0;
        for(i=2;i<20;i++){
            for(j=2;j<=i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j==i){
                if(cnt%2==0)
                    System.out.println(i);
                cnt+=1;
            }
        }
    }
}