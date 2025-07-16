package practice3;

public class leapYear {
    public static void main(String[] args) {
        int year=2014;

        if (year%400==0 || year%4==0 && year%100!=0){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap Year");
        }
    }
}
