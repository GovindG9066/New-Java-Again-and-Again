package practice3;

public class palandromNum {
    public static void main(String[] args) {
        int num=2003002;
        int original=num;
        int palandrom=0;

        while (num!=0){
            int digit=num%10;
            palandrom=palandrom*10+digit;
            num/=10;
        }
        if (palandrom==original){
            System.out.println("Palandrome");
        }else {
            System.out.println("Not Palandrome");
        }
    }
}
