package practice3;

public class primeNumber1to100 {
    public static void main(String[] args) {
        int count=100;
        int temp=0;

        for (int i=2;i<=count;i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                  temp+=1;
                }
            }
                if (temp==0){
                    System.out.println(i);
                }else {
                    temp=0;
                }
        }
    }
}
