package StarPattarnsPractice1;

public class AllTriangle {
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


    }
}
