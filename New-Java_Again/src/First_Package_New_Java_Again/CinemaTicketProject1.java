package First_Package_New_Java_Again;

import java.util.Scanner;


public class CinemaTicketProject1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to the cinema Hall...");

        System.out.println("Enter the name ");
        String name=sc.nextLine();

        System.out.println("Enter Your Age :");
        int age=sc.nextInt();

        sc.nextLine();

        System.out.println("which sit you want :");
        String seat=sc.nextLine();

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Hello "+name+" Your age is "+age+".");
        System.out.println("Your seat no is : "+seat);
        System.out.println("Enjoy the movie...");
        System.out.println("--------------------------------------------------------------------------------");


    }
}
