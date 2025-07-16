package Practice;

public class PyramidUpSideDown {
    public static void main(String[] args) {
        int count=5;

        for (int i=1;i<=count;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=count;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
