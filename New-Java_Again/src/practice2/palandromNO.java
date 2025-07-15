package practice2;

public class palandromNO {
    public static void main(String[] args) {
        int num=2012102;
        int original=num;
        int palandrom=0;

        while (num!=0){
            int digit=num%10;
            palandrom=palandrom*10+digit;
            num/=10;
        }
        if (original==palandrom){
            System.out.println("Yes! this is palandrom");
        }else {
            System.out.println("NO! Its not an palandrom no");
        }
    }
}
