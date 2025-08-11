package Aug_11;

public class revNum {
    public static void main(String[] args) {
        int num=125354;
        int rev=0;
        System.out.println("Original Number : ");
        System.out.println(num);
        System.out.println();
        while (num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        System.out.println("Reverse Number : ");
        System.out.println(rev);
    }
}
