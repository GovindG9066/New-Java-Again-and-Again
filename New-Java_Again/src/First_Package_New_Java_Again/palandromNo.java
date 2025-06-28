package First_Package_New_Java_Again;

import java.util.Scanner;

public class palandromNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int original=num;
        int reverse=0;

        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        if (original==reverse){
            System.out.println(original+" is Palindrome Number");
        }else{
            System.out.println(original+" is not Palindrome Number");
        }
    }
}
