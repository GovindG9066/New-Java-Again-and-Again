package Topic_2_ControlflowAndLoops;

import java.util.Scanner;


public class SmartCalculatorProject2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to The Smart Calculator...");

        System.out.println("Enter The First Number :");
        float firstNo=sc.nextFloat();

        System.out.println("Enter the Second Number :");
        float secondNo=sc.nextFloat();

        while (true){


            System.out.println("-----select The Operation-----");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Power");
            System.out.println("6.Module");
            System.out.println("7.Exit");

            int choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Addition of the Numbers :");
                    System.out.println(firstNo+" + "+secondNo+" = "+(firstNo+secondNo));
                    break;
                case 2:
                    System.out.println("Subtraction of the Numbers :");
                    System.out.println(firstNo+" - "+ secondNo +" = "+ (firstNo-secondNo));
                    break;
                case 3:
                    System.out.println("Multiplication of the Numbers :");
                    System.out.println(firstNo+" * "+secondNo+" = "+(firstNo*secondNo));
                    break;
                case 4:
                    System.out.println("Division of the Numbers :");
                    if (secondNo==0){
                        System.out.println("Division By Zero is not Possible...");
                        break;
                    }else {
                        System.out.println(firstNo + " / " + secondNo + " = " + (firstNo / secondNo));
                    }
                        break;
                case 5:
                    System.out.println("power of the Number is :");
                    System.out.println(firstNo+" ^ "+secondNo+" = "+(Math.pow(firstNo,secondNo)));
                    break;
                case 6:
                    System.out.println("Module of the Number is :");
                    System.out.println(firstNo+" % "+secondNo+" = "+firstNo%secondNo);
                    break;
                case 7:
                    System.out.println("Thank You for use our Smart Calculator...");
                    return;
                default:
                    System.out.println("Wrong Choice! please Choose a proper option...");
                    continue;

            }
        }

    }
}
