package First_Package_New_Java_Again;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int first=0;
        int second=1;
        System.out.println("Enter the Count :");
        int count=sc.nextInt();
        int fib=0;

        System.out.println("Fibonacci series :");
        System.out.println(first);
        System.out.println(second);

        for (int i=2;i<count;i++){
            fib=first+second;
            first=second;
            second=fib;
            System.out.println(fib);
        }
    }
}
