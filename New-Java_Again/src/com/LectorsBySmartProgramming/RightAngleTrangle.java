package com.LectorsBySmartProgramming;

public class RightAngleTrangle {
    public static void main(String[] args) {
        int count=5;
        System.out.println("Right angle triangle with Star Pattarn");
        for (int i=1;i<=count;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
