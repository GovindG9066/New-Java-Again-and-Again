package Topic4Arrays;

import java.util.Scanner;

public class maxminave {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int arr[]=new int[5];
        System.out.println("Enter the number for array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int max=arr[0];
        System.out.println("This is your array :");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum no in array : "+max);
        int min=arr[0];

        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum no in array is : "+min);


        int sum=0;
        float avg=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
             avg=sum/ arr.length;
        }
        System.out.println("Sum of all no in the array is : "+sum);
        System.out.println("Average no of an array is : "+avg);
    }
}
