package allPrograms;

public class palandromeNum {
    public static void main(String[] args) {
        int number=123321;
        int original=number;
        int rev=0;

        while (number!=0){
            int digit=number%10;
            rev=rev*10+digit;
            number/=10;
        }

        if (original==rev){
            System.out.println("Yes Palandrome");
        }else {
            System.out.println("NO Palandrome");
        }
    }
}
