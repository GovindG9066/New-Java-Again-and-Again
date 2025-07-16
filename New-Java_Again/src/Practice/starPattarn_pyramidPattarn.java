package Practice;

import java.util.Scanner;

public class starPattarn_pyramidPattarn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count :");
        int count=sc.nextInt();

        for (int i=1;i<=count;i++){
            for (int j=count;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
