package com.LectorsBySmartProgramming;

public class Factorial {
    public static void main(String[] args) {
        int num=5;
        int factNo=1;

        if (num==0){
            System.out.println("Factorial of 0 is 1");
        }else {
            for (int i=1;i<=num;i++){
                factNo*=i;
            }
            System.out.println(factNo);
        }
    }
}
