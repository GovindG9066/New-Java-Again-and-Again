package Practice1;

public class PalandromNo {
    public static void main(String[] args) {
        int num=1011;
        int original=num;
        int rev=0;

        while (num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        if (original==rev){
            System.out.println(rev+" yes, this is Palandrome Number");
        }else {
            System.out.println(rev+" No, this is Palandrome Number");

        }
    }
}
