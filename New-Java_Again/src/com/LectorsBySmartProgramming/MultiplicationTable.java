package com.LectorsBySmartProgramming;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while (flag){
            System.out.println("Enter the Number the No : ");
            int num=sc.nextInt();

            for (int i=1;i<=10;i++){
                System.out.println(num+" * "+i+" = "+num*i);
            }
            System.out.println("Enter Your Choice :(Y/N)");
            char yn=sc.next().toUpperCase().charAt(0);
            if (yn=='N'){
                System.out.println("Exit the program");
                break;
            }else {
                System.out.println("Enter Again");
            }
        }
    }
}
