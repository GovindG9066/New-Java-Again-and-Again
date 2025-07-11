package Practice1;

public class factorial {
    public static void main(String[] args) {
        int num=5;
        int sum=1;
        for (int i=1;i<=num;i++){
            sum*=i;
        }
        System.out.println("Factorial of the number :");
        System.out.println(sum);
    }
}
