package allPrograms;

public class StarPattarn {
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
            for (int j=count-1;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
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
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1;i<=count;i++){
            for (int j=2;j<=i;j++){
                System.out.print(" ");
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
            for (int l=2;l<=i;l++){
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
            for (int l=count-1;l>=i;l--){
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
                if (k<=1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            for (int l=2;l<=i;l++){
               if (l<i){
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
                if (k<count){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            for (int l=count-1;l>=i;l--){
                if (l>i){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1;i<=count;i++){
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
                if (l>i){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i=2;i<=count;i++){
            for (int j=count-1;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                if (k!=1){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            for (int l=2;l<=i;l++){
                if (l<i){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1;i<=count;i++){
            for (int j=1;j<=count;j++){
                if (i>1 && j>1 && i<count && j<count){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for (int i=1;i<=count;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1;i<=count;i++){
            for (int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1;i<=count;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for (int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1;i<=count;i++){
            for (int j=count;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();

        }
        System.out.println();
            int num=0;
            for (int i=1;i<=count;i++){
                for (int j=1;j<=i;j++){
                    num++;
                    System.out.print(num+" ");
                }
                System.out.println();
            }
        System.out.println();
        num=0;
        for (int i=1;i<=count;i++){
            for (int j=1;j<=count;j++){
                num+=1;
                System.out.print(num+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i=1;i<=count;i++){
            for (int j=1;j<=i;j++){
                if (j<=1 || j>=i || i>=count){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1;i<=count;i++){
            for (int j=count-1;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            for (int l=i-1;l>=1;l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1;i<=count;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for (int k=count-1;k>=i;k--){
                System.out.print("  ");
            }
            for (int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=count;i++){
            for (int j=count;j>=i;j--){
                System.out.print("* ");
            }
            for (int k=2;k<=i;k++){
                System.out.print("  ");
            }
            for (int l=count;l>=i;l--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


    }
}
