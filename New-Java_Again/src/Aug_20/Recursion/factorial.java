package Aug_20.Recursion;

public class factorial {
    public static int facto(int n) {

        if (n==0 || n==1){
            return 1;
        }
        int fact_n= facto(n-1);
        int fact=n*fact_n;
        return fact;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(facto(n));


    }
}
