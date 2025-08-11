package Aug_11;

public class EmptyRightAngleTriangle {
    public static void main(String[] args) {
        int count=5;

        for (int i=1;i<=count;i++){
            for (int j=1;j<=i;j++){
                if (j==1 || j==i ||i==count){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
                System.out.println();
        }
    }
}
