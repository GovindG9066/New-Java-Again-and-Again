package Practice;

public class fib1 {
    public static void main(String[] args) {
        int first=0,second=1,count=10;
        System.out.println("Fib series :");
        System.out.println(first);
        System.out.println(second);

        for (int i=2;i<=count-1;i++){
            int next=first+second;
            first=second;
            second=next;
            System.out.println(next);
        }

    }
}
