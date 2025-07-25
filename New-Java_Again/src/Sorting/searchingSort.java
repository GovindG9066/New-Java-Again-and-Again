package Sorting;

public class searchingSort {
    public static void main(String[] args) {
        int[] a={45,32,8,6,22,15,32};
        int temp=0;

        for (int i=0;i<a.length;i++){
            int min=i;
            for (int j=i+1;j<a.length;j++){
                if (a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for (int i:a){
            System.out.print(i+" ");
        }
    }
}
