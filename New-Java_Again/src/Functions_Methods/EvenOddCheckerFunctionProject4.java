package Functions_Methods;

import java.util.Scanner;

public class EvenOddCheckerFunctionProject4 {
   static Scanner sc=new Scanner(System.in);

    public static void input(){
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int number=check(num);
    }
    public static int check(int n){
        if (n%2==0){
            System.out.println(n+" is even");

        }else{
            System.out.println(n+" is Odd");
        }
        return n;
    }
    public static void main(String[] args) {
        input();
    }
}
