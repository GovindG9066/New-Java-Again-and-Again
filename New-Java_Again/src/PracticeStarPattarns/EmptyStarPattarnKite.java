package PracticeStarPattarns;

public class EmptyStarPattarnKite {
    public static void main(String[] args) {
        int count=5;

        for (int i=1;i<=count;i++){
            for (int j=count;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                if (k>=2 && i>=2){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            for (int l=2;l<=i;l++){
                if (i>=2 && l<=i-1){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i=2;i<=count;i++){
            for (int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=count;k>=i;k--){
                if (i>=2 && k<=count-1){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            for (int l=count-1;l>=i;l--){
                if (i>=2 && l!=i){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
