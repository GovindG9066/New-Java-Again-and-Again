package Arrays_In_Java;

public class simple_int_arrary {
    public static void main(String[] args) {
        int empNo[]=new int[5];

        int[] no=new int[3];
        no[0]=10;
        no[1]=20;
        no[2]=30;

        for (int i=0;i<no.length;i++){
            System.out.println(no[i]);
        }

        System.out.println();

        int[] a={10,20,30,40,50};

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
