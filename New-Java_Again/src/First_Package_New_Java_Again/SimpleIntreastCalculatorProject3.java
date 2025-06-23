package First_Package_New_Java_Again;

import java.util.Scanner;


public class SimpleIntreastCalculatorProject3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Hello welcome....");
        System.out.println("Here you can calculate your Intreast base on the rate of intreast and the year for it");

        System.out.println("Enter Your Name :");
        String name=sc.nextLine();

        System.out.println("Enter the Principle :");
        float principle=sc.nextFloat();

        System.out.println("Enter the Rate of Intreast (in percent):");
        float rate=sc.nextFloat();

        System.out.println("Enter the Time (In Year)");
        float time=sc.nextFloat();

        float simpleintreast=(principle * rate * time)/100;

        float finalAmount=principle+simpleintreast;


        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("Hello "+name);
        System.out.println("Your simple intreast is "+simpleintreast);
        System.out.println("Final Amount paid after "+time+" Years is "+finalAmount);

        System.out.println("You will able to pay "+finalAmount+" after the "+time+" Years.");

        System.out.println("Thank you for visit us...");

        System.out.println("---------------------------------------------------------------------------------");


    }
}
