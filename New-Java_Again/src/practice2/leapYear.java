package practice2;

public class leapYear {
    public static void main(String[] args) {
        int year=2013;

        if (year%400==0 || year%4==0 && year%100!=0){
            System.out.println(year+" is Leap Year");
        }else {
            System.out.println(year+" is not an leap Year");
        }
    }
}
