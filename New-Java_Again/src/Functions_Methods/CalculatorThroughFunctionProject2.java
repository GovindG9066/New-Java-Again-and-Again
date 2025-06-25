package Functions_Methods;

import java.util.Scanner;

public class CalculatorThroughFunctionProject2 {
    static Scanner sc=new Scanner(System.in);
    public static void input(){

        System.out.println("Welcome to the SmartFunctionCalculator...");
        System.out.println("..................................................");

        System.out.println("Enter the First No :");
        int Num1=sc.nextInt();

        System.out.println("Enter the Second No :");
        int Num2=sc.nextInt();

        System.out.println("Enter the Operation :");
        char operator=sc.next().charAt(0);

        System.out.println("...................................................");

        double result=calculate(Num1,Num2,operator);
        display(result);
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static int module(int a,int b){
        return a%b;
    }
    public static double power(double a,double b){
        return Math.pow(a,b);
    }
    public static double calculate(int a,int b,char op){
        switch (op){
            case '+':
                System.out.println("Addition is : ");
                        return add(a,b);
            case '-':
                System.out.println("Subtraction is : ");
                        return sub(a,b);
            case '*':
                System.out.println("Multiplication is : ");
                        return mul(a,b);
            case '/':
                System.out.println("division is : ");
                        return div(a,b);
            case '%':
                System.out.println("module is : ");
                        return module(a,b);
            case '^':
                System.out.println("power is : ");
                        return power(a,b);

            default:
                System.out.println("Invalid Choice please Choose appropriate option...");
                        return 0;
        }
    }

    public static void display(double result){
        System.out.println("----------------------------------------------");
        System.out.println("Here is your soluction...");
        System.out.println(result);
        return;

    }
    public static void main(String[] args) {
        input();
    }
}
