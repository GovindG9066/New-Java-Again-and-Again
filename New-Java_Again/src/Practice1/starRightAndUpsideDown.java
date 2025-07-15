package Practice1;

public class starRightAndUpsideDown {
    public static void main(String[] args) {
        int num=4;

        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=num;i++){
            for (int j=num-1;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
