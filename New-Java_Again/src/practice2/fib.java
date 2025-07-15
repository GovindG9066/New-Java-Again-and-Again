package practice2;

public class fib {
    public static void main(String[] args) {
        int count=10;
        int first=0;
        int second=1;
        int fib=1;
        System.out.println(first);
        System.out.println(second);

        for (int i=2;i<=count-1;i++){
            int next=first+second;
            System.out.println(next);
            first=second;
            second=next;
        }
    }
}
