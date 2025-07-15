package Practice1;

public class UpSideDownrightAnjgleTriangle {
    public static void main(String[] args) {
        int num=5;

        for (int i=num;i>=0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
