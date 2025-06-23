package First_Package_New_Java_Again;

import java.util.Scanner;

public class BWI_BodyWeightIndex_Project2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Hello welcome to the BWI App...");

        System.out.println("Lets calculate your BWI");

        System.out.println("Enter your Name :");
        String name=sc.nextLine();

        System.out.println("Enter your Weight: ");
        float weight=sc.nextFloat();

        System.out.println("Enter your height: ");
        float height=sc.nextFloat();

        sc.nextLine();

        float bmi=weight/(height * height);


        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Hello "+name+" Your Weight is "+weight+" and your height is "+height);
        System.out.println("Your BWI is :"+bmi);

        if (bmi<18.5){
            System.out.println("You are Underweight");
        } else if (bmi<24.9) {
            System.out.println("You are Normal");
        } else if (bmi<29.00) {
            System.out.println("You are OverWeighted");
        } else {
            System.out.println("You are Obese");
        }

        System.out.println("---------------------------------------------------------------------------");

    }
}
