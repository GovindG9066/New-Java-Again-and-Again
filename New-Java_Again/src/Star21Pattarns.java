public class Star21Pattarns {
    public static void main(String[] args) {
        int  count =5;
        System.out.println("1.");

       for (int i=1;i<=count;i++){
           for (int j=1;j<=i;j++){
               System.out.print("* ");
           }
           System.out.println();
       }

        System.out.println("----------------------------------------------------------------");
        System.out.println("2.");

       for (int i=1;i<=count;i++){
           for (int j=count;j>=i;j--){
               System.out.print("* ");
           }
           System.out.println();
       }

        System.out.println("----------------------------------------------------------------");

        System.out.println("3.");

       for (int i=1;i<=count;i++){
           for (int j=count-1;j>=i;j--){
               System.out.print("  ");
           }
           for (int k=1;k<=i;k++){
               System.out.print("* ");
           }
           System.out.println();
       }

        System.out.println("----------------------------------------------------------------");

        System.out.println("4.");
       for (int i=1;i<=count;i++){
           for (int j=2;j<=i;j++){
               System.out.print("  ");
           }
           for (int k=count;k>=i;k--){
               System.out.print("* ");
           }
           System.out.println();
       }

        System.out.println("----------------------------------------------------------------");

        System.out.println("5.");

        for (int i=1;i<=count;i++){
            for (int j=count-1;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("6.");

        for (int i=1;i<=count;i++){
            for (int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=count;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("7.");
        for (int i=1;i<=count;i++){
            for (int j=count-1;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            for (int l=2;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("8.");

        for (int i=1;i<=count;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for (int k=count;k>=i;k--){
                System.out.print("* ");
            }
            for (int l=count-1;l>=i;l--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("9.");

        for (int i=1;i<=count;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=2;i<=count;i++){
            for (int j=count;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("10.");

        for (int i=1;i<=count;i++){
            for (int j=count-1;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=2;i<=count;i++){
            for (int j=2;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=count;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("11.");

        for (int i=1;i<=count;i++){
            for (int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=count;k>=i;k--){
                System.out.print("* ");
            }
            for (int l=count-1;l>=i;l--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=2;i<=count;i++){
            for (int j=count;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            for (int l=2;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
