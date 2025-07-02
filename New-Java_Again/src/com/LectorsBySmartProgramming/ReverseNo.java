package com.LectorsBySmartProgramming;

public class ReverseNo {
    public static void main(String[] args) {
        int no=8546;
        int rev=0;
        String a="govind";
        while (no!=0){
            int digit=no % 10;
            rev=rev*10+digit;
            no/=10;
        }
        System.out.println(rev);
    }
}
