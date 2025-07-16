package Practice;

public class PyramidPattarnwithCenterStarUpSideDown {
    public static void main(String[] args) {
        int count=4;

        for (int i=1;i<=count;i++){
            for (int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=count;k>=i;k--){
                System.out.print("* ");
            }
            for (int l=count-1;l>=i;l--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
