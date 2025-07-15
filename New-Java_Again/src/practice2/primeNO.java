package practice2;

public class primeNO {
    public static void main(String[] args) {
        int num=12;
        int temp=0;

        for (int i=2;i<num;i++){
            if (num%i==0){
                temp+=1;
            }
        }
        if (temp>=1){
            System.out.println("NO! Its not prime no");
        }else {
            System.out.println("Yes! its an Prime no");
        }
    }
}
