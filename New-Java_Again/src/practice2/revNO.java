package practice2;

public class revNO {
    public static void main(String[] args) {
        int num=26542;
        int rev=0;
        System.out.println("Original :");
        System.out.println(num);

        while (num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;

        }
        System.out.println("reverse :");
        System.out.println(rev);
    }
}
