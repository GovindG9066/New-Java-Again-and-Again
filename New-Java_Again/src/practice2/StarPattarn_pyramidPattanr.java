package practice2;

public class StarPattarn_pyramidPattanr {
    public static void main(String[] args) {
        int count=5;
        for (int i=1;i<=count;i++){
            for (int j=count;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
