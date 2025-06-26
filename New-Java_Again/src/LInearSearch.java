import java.util.Scanner;

public class LInearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter values for an array : ");

        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your array is :");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter the value for search :");
        int search=sc.nextInt();
        boolean found=false;
        for (int i=0;i< arr.length;i++){
            if (arr[i]==search){
                System.out.println("Search "+search+" found on the index "+i);
                found=true;
                break;
                }
            }
            if (!found){
                System.out.println("Search "+search+" not found");
        }

    }
}
