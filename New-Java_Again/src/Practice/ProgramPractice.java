package Practice;

public class ProgramPractice {
    public static void main(String[] args) {
        int num=1234;
        int rev=0;
        while (num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        System.out.println(rev);

        String name="Gadekar";
        for (int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
        System.out.println();
        System.out.println("Fibo");

        int a=0,b=1,count=10;
        System.out.println(a);
        System.out.println(b);

        for (int i=2;i<=count-1;i++){
            int next=a+b;
            System.out.println(next);
            a=b;
            b=next;
        }
        System.out.println("Palandrom No program");

        int palNo=12121;
        int PalandromRev=0;
        int original=palNo;

        while (palNo!=0){
            int digit=palNo%10;
            PalandromRev=PalandromRev*10+digit;
            palNo/=10;

        }
        if (original==PalandromRev){
            System.out.println("Palandrom");
        }else {
            System.out.println("Not Palandrom");
        }

        System.out.println("Swipe 2 no without using 3rd variable");

        int firstNoSwipe=12,secondNoSwipe=21;
        System.out.println("First Beginning :");
        System.out.println(firstNoSwipe);
        System.out.println(secondNoSwipe);

        firstNoSwipe=firstNoSwipe+secondNoSwipe;
        secondNoSwipe=firstNoSwipe-secondNoSwipe;
        firstNoSwipe=firstNoSwipe-secondNoSwipe;

        System.out.println("After :");
        System.out.println(firstNoSwipe);
        System.out.println(secondNoSwipe);


    }
}
