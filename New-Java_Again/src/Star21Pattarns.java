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

        System.out.println("----------------------------------------------------------------");

        System.out.println("12.");

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
        for (int i=2;i<=count;i++){
            for (int j=2;j<=i;j++){
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

        System.out.println("13.");

        for (int i=1;i<=count;i++){
            for (int j=count-1;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                if (k>1){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            for (int l=2;l<=i;l++){
                if (l<=i-1){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("14.");

        for (int i=1;i<=count;i++){
            for (int j=2;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=count;k>=i;k--){
                if (k>=count){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            for (int l=count-1;l>=i;l--){
                if (l==i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("15.");

        for (int i=1;i<=count;i++){
            for (int j=count-1;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                if (k>=2){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            for (int l=2;l<=i;l++){
                if (l==i){
                    System.out.print("*");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i=2;i<=count;i++){
            for (int j=2;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=count;k>=i;k--){
                if (k==count){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            for (int l=count-1;l>=i;l--){
                if (l==i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("16.");

        for (int i=1;i<=count;i++){
            for (int j=1;j<=i;j++){
                if (j==i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("17.");

        for (int i=1;i<=count;i++){
            for (int j=count;j>=i;j--){
                if (j==i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("18.");

        for (int i=1;i<=count;i++){
            for (int j=2;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=count;k>=i;k--){
                if (k>=count){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("19.");

        for (int i=1;i<=count;i++){
           for (int j=count-1;j>=i;j--){
               System.out.print("  ");
           }
           for (int k=1;k<=i;k++){
               if (k>=2){
                   System.out.print("  ");
               }else {
                   System.out.print("* ");
               }
           }
            System.out.println();
        }
    }
}
