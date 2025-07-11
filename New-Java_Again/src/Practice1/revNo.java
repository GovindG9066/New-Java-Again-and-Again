package Practice1;

public class revNo {
    public static void main(String[] args) {
        int num=1122;
        int rev=0;
        System.out.println(num);

        while (num != 0) {
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;

        }
        System.out.println("Reverese of the Number is :");
        System.out.println(rev);
    }
}
