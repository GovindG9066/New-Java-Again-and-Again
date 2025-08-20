package Aug_20.Recursion;

public class BasicUnderstingOfRecursion {
    public static void printnum(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }

    public static void printNum1to5(int num){
        if (num>5){
            return;
        }
        System.out.println(num);
        printNum1to5(num+1);
    }
    public static void main(String[] args) {
        int n=5;
        printnum(n);

        System.out.println();
        int num=1;

        printNum1to5(num);
    }
}
