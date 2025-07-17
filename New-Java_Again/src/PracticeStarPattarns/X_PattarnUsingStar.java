package PracticeStarPattarns;

public class X_PattarnUsingStar {
    public static void main(String[] args) {
        int count=4;

        for (int i=1;i<=count;i++){
            for (int j=2;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=count;k>=i;k--){
                if (i>=1 && k>1){
                    System.out.print("  ");
                }else {
                System.out.print("* ");

                }
            }
            System.out.println();
        }
    }
}
