package Sorting;

public class bubbleSort1 {
    public static void main(String[] args) {
        int[] a={11,55,32,4,16,25};
        int temp=0;
        int flag=0;
        for (int i=0;i<a.length;i++){
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
        for (int i:a){
            System.out.print(i+" ");
        }
    }
}
