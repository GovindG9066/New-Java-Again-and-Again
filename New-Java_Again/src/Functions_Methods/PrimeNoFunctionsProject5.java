package Functions_Methods;

import java.util.Scanner;

public class PrimeNoFunctionsProject5 {
    static Scanner sc=new Scanner(System.in);

    public static void checkPrime(){
        System.out.println("Enter The number to check Prime or not : ");
        int num=sc.nextInt();
        for (int i=2;i<=num-1;i++){
            if (num%i==0){
                System.out.println("This is prime");
            }else{
                System.out.println("this is not an prime");
            }
    }

    }

    public static void main(String[] args) {
        checkPrime();
    }
}
