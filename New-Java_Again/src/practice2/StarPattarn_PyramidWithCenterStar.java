package practice2;

public class StarPattarn_PyramidWithCenterStar {
    public static void main(String[] args) {
        int count=4;
        for (int i=1;i<=count;i++){
            for (int j=count;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            for (int l=2;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
