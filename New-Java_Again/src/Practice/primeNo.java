package Practice;

public class primeNo {
    public static void main(String[] args) {
        int no=11,temp=0;

        for (int i=2;i<=no-1;i++){
            if (no%i==0){
                temp+=1;
            }
        }
        if (temp>0){
            System.out.println("NOT an Prime No");
        }else {
            System.out.println("Prime No");
        }
    }
}
