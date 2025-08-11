package Aug_11;

public class PrimeNum {
    public static void main(String[] args) {
        int num=6;
        int flag=0;
        for (int i=2;i<num;i++){
            if (num % i ==0 ){
                flag+=1;
            }
        }
        if (flag>=1){
            System.out.println("NOt prime");
        }else {
            System.out.println("Num is prime");
        }
    }
}
