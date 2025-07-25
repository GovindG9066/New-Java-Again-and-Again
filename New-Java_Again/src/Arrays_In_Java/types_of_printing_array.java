package Arrays_In_Java;

public class types_of_printing_array {
    public static void main(String[] args) {

        int[] a={10,20,30,40,50};

        System.out.println("First : For Loop - ");

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.println();

        System.out.println("Second : for_each Loop - ");

        for (int i:a){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println();

        System.out.println("Third : while Loop - ");

        int i=0;
        while (i<a.length){
            System.out.print(a[i]+" ");
            i++;
        }
        System.out.println();

        System.out.println();

        System.out.println("Fourth : do while loop - ");
        int j=0;

        do {
            System.out.print(a[j]+" ");
            j++;
        }
        while (j<a.length);

        System.out.println();
        System.out.println();

    }
}
