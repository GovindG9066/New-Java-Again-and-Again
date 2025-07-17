package PracticeStarPattarns;

public class BoxPattarnUsingStar {
    public static void main(String[] args) {
        int count=4;
        for (int i=1;i<=count;i++){
            for (int j=count;j>=i;j--){
                if (i>=2 && j>=i-1){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                };
            }
                System.out.println();
        }
    }
}
