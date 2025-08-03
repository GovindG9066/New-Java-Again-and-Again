package Aug_3;

public class factorofNum {
    public static void main(String[] args) {
        int number=10;

        for (int i=1;i<=number;i++){
            if (number%i==0){
                System.out.println(i);
            }
        }
    }
}
