package Sorting;

public class bubble_And_selectionSort {
    public static void main(String[] args) {
        int[] a={15,12,3,5,66,55,9};
        int temp=0;

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int i:a){
            System.out.print(i+" ");
        }

        System.out.println();

        int[] b={5,66,24,9,6,33,4,91};
        int temp1=0;

        for (int i=0;i<b.length;i++){
            int min=i;
            for (int j=i+1;j<b.length;j++){
                if (b[j]<b[min]){
                    min=j;
                }
            }
            temp1=b[i];
            b[i]=b[min];
            b[min]=temp1;
        }

        for (int i:b){
            System.out.print(i+" ");
        }

    }
}
