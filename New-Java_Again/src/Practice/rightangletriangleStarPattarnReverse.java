package Practice;

public class rightangletriangleStarPattarnReverse {
    public static void main(String[] args) {
        int count=5;
        for(int i=count;i!=0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
