package Practice1;

public class PrimeNo {
    public static void main(String[] args) {
        int no=11;
        int temp=0;
        for (int i=2;i<no;i++){
            if (no%i==0) {
                temp += 1;
            }
        }
        if (temp>1){
            System.out.println(no+" is not an prime NO");
        }else {
            System.out.println(no+" is an prime NO");
        }
    }
}
