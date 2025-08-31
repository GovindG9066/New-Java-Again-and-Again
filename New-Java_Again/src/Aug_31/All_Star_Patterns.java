package Aug_31;

public class All_Star_Patterns {
    public static void main(String[] args) {
        int count=5;

        for (int i=0;i<=count;i++){
            for (int j=0;j<i;j++){
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
    }
}
