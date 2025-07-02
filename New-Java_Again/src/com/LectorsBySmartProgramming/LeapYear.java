package com.LectorsBySmartProgramming;

public class LeapYear {
    public static void main(String[] args) {
        int year=2015;

        if (year%400==0 || year%4==0 && year%100!=0){
            System.out.println(year+" is the Leap year");
        }else {
            System.out.println(year+" is not an leap year");
        }
    }
}
