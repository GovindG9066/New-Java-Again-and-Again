package practice3;

public class numRev {
    public static void main(String[] args) {
        int num=5236;
        int rev=0;
        System.out.println("Original : "+num);

        while (num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        System.out.println(rev);

    }
}
