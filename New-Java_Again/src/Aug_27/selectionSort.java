package Aug_27;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={48,7,64,4,41,35,15,2};
        int temp=0,min;

        for (int i=0;i< arr.length;i++){
            min=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
        }
        for (int k=0;k< arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
