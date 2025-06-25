package Functions_Methods;

import java.util.Scanner;

public class votingCheckerFunctionProject3 {
   static Scanner sc=new Scanner(System.in);

    public static void Info(){
        System.out.println("----------------------------------------------------");
        System.out.println("Welcome to the VoteKro App");
        System.out.println("Enter Your Name :");
        String name=sc.nextLine();
        System.out.println("Enter Your Age :");
        int age=sc.nextInt();
        checkVoteAllow(age);

    }
    public static void checkVoteAllow(int age){
        if(age>=18){
            System.out.println("Yes You Can Vote");
        }else{
            System.out.println("You are Child,Not eligible for Vote...");
        }

    }

    public static void main(String[] args) {
        Info();

    }
}
