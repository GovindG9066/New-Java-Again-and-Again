package practice2;

public class starpattarnRigjhtAngleAndUpSideDownMix {
    public static void main(String[] args) {
        int count=4;

        for (int i=1;i<=count;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=count;i++){
            for (int j=count-1;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
