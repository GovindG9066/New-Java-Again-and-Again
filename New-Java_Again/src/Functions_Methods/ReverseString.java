package Functions_Methods;
import java.util.Scanner;

public class ReverseString {
    public static void reverseString(String name){
        String reversename="";
        for (int i=name.length()-1;i>=0;i--){
            reversename+=name.charAt(i);
        }
            System.out.println(reversename);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The value for Reverse :");
        String name=sc.nextLine();
        System.out.println("Your Reverse String value is :");
        reverseString(name);
    }
}
