package Functions_Methods;

import java.security.Principal;
import java.util.Scanner;

public class SimpleIntreastCalculatorFunctions {
    static Scanner sc=new Scanner(System.in);

    public static void input(){
        System.out.println("Enter the Principle :");
        int principle=sc.nextInt();

        System.out.println("Enter the rate of intreast % :");
        float rate=sc.nextFloat();

        System.out.println("Enter the Time (Year) : ");
        int time=sc.nextInt();
        double result=calculate(principle,rate,time);
        double TotalAmountAfterTime=principle+result;

        display(result,TotalAmountAfterTime);
    }
    public static double calculate(int p,float r,int t){
        System.out.println("Simple Interest is :");
        double SI=(p*r*t)/100;
        return SI;
    }
    public static void display(double result,double TotalResult){
        System.out.println("------------------------------------");
        System.out.println("Simple Interest is: "+result);
        System.out.println("Total Amount :"+TotalResult);

    }

    public static void main(String[] args) {
        input();
    }
}
