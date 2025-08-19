package Aug_19;

public class simpleStar {
    public static void main(String[] args) {
        int count=5;

        for (int i=0;i<count;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");

        for (int i=0;i<count;i++){
            for (int j=count-1;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
    }
}
