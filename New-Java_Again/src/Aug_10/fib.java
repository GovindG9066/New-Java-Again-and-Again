package Aug_10;

public class fib {
    public static void main(String[] args) {
        int a=0,b=1,count=10;
        System.out.println(a);
        System.out.println(b);

        for (int i=2;i<count;i++){
            int next=a+b;
            System.out.println(next);

            a=b;
            b=next;
        }
    }
}
