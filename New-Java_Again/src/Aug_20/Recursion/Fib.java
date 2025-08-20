package Aug_20.Recursion;

public class Fib {
    public static void fib(int i,int j,int n){

        if (n==0){
            return;
        }
        int sum=i+j;
        System.out.println(sum);
        fib(j,sum,n-1);
    }
    public static void main(String[] args) {
        int i=0,j=1,n=10;
        System.out.println(i);
        System.out.println(j);
        fib(i,j,n-2);

    }
}
