public class StringClassnew {
    public static void main(String[] args) {
        String s = "Keerthi".toLowerCase();
        System.out.println(s);
        int n=s.length();
        int i=0;
        for(;i<n;i++){
            if(s.charAt(n - i - 1) != s.charAt(i)){
                System.out.println("Not Palindrome");
                break;
            }
        }
        if(i==n) {
            System.out.println("Palindrome");
        }
    }
}
