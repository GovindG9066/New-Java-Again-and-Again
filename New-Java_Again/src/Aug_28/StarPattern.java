package Aug_28;

public class StarPattern {
    public static void main(String[] args) {
        int count=5;

        for (int i=0;i<=count;i++){
            for (int j=count;j>i;j--){
                System.out.print("  ");
            }
            for (int k=0;k<i;k++){
                System.out.print("* ");
            }
            for (int l=1;l<i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
