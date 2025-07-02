package DADA;

public class Fibo {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int count=10;
        System.out.println(first);
        System.out.println(second);

       for(int i=2;i<=count-1;i++){
           int sum=first+second;
           first=second;
           second=sum;

        System.out.println(sum);
       }
    }
}
