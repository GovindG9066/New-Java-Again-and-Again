package Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a={29,12,5,36,19};
        int temp=0;
        for (int i=0;i<a.length;i++){
            int flag=0;
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;

                   flag=1;
                }
            }
            if (flag==0){
                break;
            }

        }
        System.out.println("Bubble Sort : ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
