package com.LectorsBySmartProgramming;

public class swipe2Nowith3rsVariable {
    public static void main(String[] args) {
        int first=10;
        int second=20;
        System.out.println("Befor");

        System.out.println("First= "+first);
        System.out.println("Second= "+second);

        int third=first;
        first=second;
        second=third;

        System.out.println("After");
        System.out.println("First= "+first);
        System.out.println("Second= "+second);
    }
}
