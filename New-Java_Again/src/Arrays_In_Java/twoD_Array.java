package Arrays_In_Java;

public class twoD_Array {
    public static void main(String[] args) {
        int[][] a= new int[2][3];
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[1][0]=40;
        a[1][1]=50;
        a[1][2]=60;



        int[][] b={{10,20,30},{40,50,60,70}};
        System.out.println(b[0][0]);

        System.out.println(b.length);
        System.out.println(b[0].length);


        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }


    }
}
