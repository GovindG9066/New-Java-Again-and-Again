package Practice;

public class flipRightAngleTriangleStarPattarn {
    public static void main(String[] args) {
        System.out.println("Star Pattarn");
        int count=4;
        for (int i=1;i<=count;i++){
            for (int j=count-1;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
