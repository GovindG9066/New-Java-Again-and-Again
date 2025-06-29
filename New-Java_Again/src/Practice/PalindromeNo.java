package Practice;

public class PalindromeNo {
    public static void main(String[] args) {
        int num=11211;
        int original=num;
        int rev=0;

        while (num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        if (rev==original){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }
    }
}
