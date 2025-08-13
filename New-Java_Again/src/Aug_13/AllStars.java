package Aug_13;

public class AllStars {
    public static void main(String[] args) {
        int count=5;

        for (int i=1;i<=count;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i=1;i<=count;i++){
            for (int j=count;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i=1;i<=count;i++){
            for (int j=2;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=count;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


        for (int i=1;i<=count;i++){
            for (int j=count-1;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
