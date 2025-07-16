package practice3;

public class armstrongNum {
    public static void main(String[] args) {
        int num=151;
        int original=num;

        int result=0;

        while (num!=0){
            int digit=num%10;
            result+=Math.pow(digit,3);
            num/=10;
        }
        if (original==result){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }
    }
}
