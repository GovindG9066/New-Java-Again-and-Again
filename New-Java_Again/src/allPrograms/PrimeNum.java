package allPrograms;

public class PrimeNum {
    public static void main(String[] args) {
        int num=8;
        boolean isTrue=true;

        for (int i=2;i<num;i++){
            if (num%i==0){
                isTrue=false;
            }
        }
        if (isTrue==true){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}
