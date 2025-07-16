package Practice;

public class flipRightAngleTriangleStarPattarnUpSideDown {
    public static void main(String[] args) {
        int count=4;

        for (int i=1;i<=count;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for (int k=count;k>=i;k--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
