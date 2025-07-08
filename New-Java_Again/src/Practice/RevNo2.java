package Practice;

public class RevNo2 {
    public static void main(String[] args) {
        int no=12345;
        int rev=0;
        while (no!=0){
            int digit=no%10;
            rev=rev*10+digit;
            no/=10;

        }
        System.out.println(rev);
    }
}
