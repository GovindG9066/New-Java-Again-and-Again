package Aug_27;

public class StarPattern {
    public static void main(String[] args) {
        int count=5;

        for (int i=0;i<count;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0;i<=count;i++){
            for (int j=count;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0;i<=count;i++){
            for (int j=count;j>i;j--){
                System.out.print("  ");
            }
            for (int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0;i<=count;i++){
            for (int j=0;j<i;j++){
                System.out.print("  ");
            }
            for (int k=count;k>i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0;i<=count;i++){
            for (int j=count;j>i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
