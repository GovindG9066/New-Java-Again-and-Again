package Aug_3;

public class palandrome1To100 {
    public static void main(String[] args) {
        int count=100;
        for (int i=2;i<=count;i++){
            int temp=0;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    temp+=1;
                }
            }
            if (temp==0){
                System.out.println(i);
            }
        }
    }
}
