package Topic4Arrays;

import java.util.Scanner;

public class BasicArrayUndersting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the values for the Array : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            System.out.println("Marks for sub " + (i+1) +" is " +arr[i]);

        }

    }
}
