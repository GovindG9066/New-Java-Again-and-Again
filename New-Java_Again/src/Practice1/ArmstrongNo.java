package Practice1;

public class ArmstrongNo {
    public static void main(String[] args) {
        int num=153;
        int original=num;
        double arm=0;

        while (num!=0){
            int digit=num%10;
            arm+=Math.pow(digit,3);
            num/=10;
        }
        if (original==arm){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong NO");
        }
    }
}
