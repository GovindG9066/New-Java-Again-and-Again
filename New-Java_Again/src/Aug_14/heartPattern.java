package Aug_14;

public class heartPattern {
    public static void main(String[] args) {
        int count=5;

        for (int i=4;i<=count;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for (int k=count;k>i;k--){
                System.out.print("  ");
            }
            for (int l=count;l>i;l--){
                System.out.print("  ");
            }
            for (int m=1;m<=i;m++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=1;i<=count;i++){
            for (int j=2;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=count;k>=i;k--){
                System.out.print("* ");
            }
            for (int l=count;l>=i;l--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
