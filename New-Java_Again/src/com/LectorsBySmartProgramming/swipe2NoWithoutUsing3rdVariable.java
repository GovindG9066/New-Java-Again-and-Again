package com.LectorsBySmartProgramming;

public class swipe2NoWithoutUsing3rdVariable {
    public static void main(String[] args) {
        int first=10,second=20;

        System.out.println("Before");
        System.out.println("First= "+first);
        System.out.println("Second= "+second);

//        first=first+second;
//        second=first-second;
//        first=first-second;

        second=second-first;
        first=first+second;

        System.out.println("After Swipe");

        System.out.println("First= "+first);
        System.out.println("Second= "+second);
    }
}
