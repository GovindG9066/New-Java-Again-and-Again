package com.LectorsBySmartProgramming;

public class PrimeNo {
    public static void main(String[] args) {
        int NO=7;
        int temp=0;

        for (int i=2;i<=NO-1;i++){
            if (NO%i==0){
                temp+=1;
            }
        }
        if (temp>0){
            System.out.println(NO+" is Not an Prime Number");
        }else {
            System.out.println(NO+" is Prime Number");
        }
    }
}
