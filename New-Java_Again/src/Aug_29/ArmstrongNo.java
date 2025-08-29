package Aug_29;

public class ArmstrongNo {
    public static void main(String[] args) {
        int num=153;
        int original=num;
        double arm=0;

        while (num != 0){
            int digit=num%10;
            arm=arm+Math.pow(digit,3);
            num/=10;
        }
        if (original==arm){
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }
    }
}
