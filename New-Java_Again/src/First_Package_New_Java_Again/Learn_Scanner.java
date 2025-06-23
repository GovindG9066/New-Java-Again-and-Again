package First_Package_New_Java_Again;

import java.util.Scanner;


public class Learn_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Now we use the Scanner");

        System.out.println("Enter your first name  :");
        String name=sc.nextLine();

        System.out.println("Enter your second Father name: ");
        String Father=sc.nextLine();

        System.out.println("Enter your Surname:");
        String Surname=sc.nextLine();

        System.out.println("Enter your Age:");
        int Age=sc.nextInt();

        System.out.println("Hello every one my name is "+name+" "+Father+" "+Surname +" and I am "+Age+" years old.");


    }
}
