package Topic_2_ControlflowAndLoops;

import java.util.Scanner;


public class ATM_Simulator_Project1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int InitialPass=9066;
        int attempts=0;
        int InitialBalance=5000;
        System.out.println("Welcome to the ATM");

        while (attempts<3) {
            System.out.println("Enter Your 4 digit Password");
            int pass = sc.nextInt();
            if (pass==InitialPass){
                System.out.println("Login Successfully...");
                break;
            }else {
                System.out.println("You Entered Wrong Password,Please Try Again");
                attempts++;
            }

            if (attempts==3){
                System.out.println("Your account is block for a while...");
                System.out.println("please Try again some time later...");
                return;
            }
        }

        while (true){
            System.out.println("----Welcome to Menu----");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");

            System.out.println("Choose as Option...");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Total Balance in Account is : "+InitialBalance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit :");
                    int deposit=sc.nextInt();
                    InitialBalance+=deposit;
                    System.out.println(deposit+" Deposited Successfully");
                    break;
                case 3:
                    System.out.println("Enter the withdraw amount :");
                    int withdraw=sc.nextInt();
                    if (withdraw<InitialBalance){
                        InitialBalance-=withdraw;
                        System.out.println("Collect Your Cash..." +withdraw);
                        break;
                    }else {
                        System.out.println("Insufficient Balance");
                    }
                case 4:
                    System.out.println("Thank You For visiting....");
                    return;
                default:
                    System.out.println("Invalid Choice");
                    continue;

            }
        System.out.println("Exit The program");
        }

    }
}
