package Functions_Methods;

import java.util.Scanner;


public class StudentMarksheetGeneratorProject1 {
    static Scanner sc=new Scanner(System.in);

    static String name;
    static int roll;
    static int s1,s2,s3,s4,s5;
    static float percentage;
    static int TotalMarks;
    static String grade;

    public static void input(){
        System.out.println("Enter your name :");
         name=sc.nextLine();

        System.out.println("Enter Your Roll No :");
         roll=sc.nextInt();

        System.out.println("Enter Marks for Sub1 : ");
         s1=sc.nextInt();

        System.out.println("Enter Marks for Sub2 : ");
         s2=sc.nextInt();

        System.out.println("Enter Marks for Sub3 : ");
         s3=sc.nextInt();

        System.out.println("Enter Marks for Sub4 : ");
         s4=sc.nextInt();

        System.out.println("Enter Marks for Sub5 : ");
         s5=sc.nextInt();

    }
    public static void calculate(){
        TotalMarks=s1+s2+s3+s4+s5;
        percentage=TotalMarks/5.0f;

        if (percentage>=90){
            grade="A";
        } else if (percentage>=80) {
            grade="B";
        } else if (percentage>=60) {
            grade="C";
        }else if(percentage>=35){
            grade="D";
        }else {
            System.out.println("Fail");
        }
    }


    public static void Display(){
        input();
        calculate();

        System.out.println("-------Student MarkSheet--------");
        System.out.println("Name "+name);
        System.out.println("Roll No "+roll);
        System.out.println("Sub 1 :"+s1);
        System.out.println("Sub 2 :"+s2);
        System.out.println("Sub 3 :"+s3);
        System.out.println("Sub 4 :"+s4);
        System.out.println("Sub 5 :"+s5);

        System.out.println("Total Marks : 500");
        System.out.println("Obtain Marks "+TotalMarks);
        System.out.println("Total Percentage :"+percentage);

        System.out.println("Obtain Grade : "+grade);

    }
    public static void main(String[] args) {
        Display();
    }
}
