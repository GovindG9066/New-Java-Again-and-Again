package PracticeStarPattarns;

public class EmptyPyramidStarPattarnHavingNoDownDiagonal {
    public static void main(String[] args) {
        int count=4;

        for (int i=1;i<=count;i++){
            for (int j=count-1;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                if (i>=2 && k>=2){
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
            for (int j=2;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=count;k>=i;k--){
                if (i>=1 && k==count){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            for (int l=count-1;l>=i;l--){
                if (l<=i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
                System.out.println();
        }
    }

}
