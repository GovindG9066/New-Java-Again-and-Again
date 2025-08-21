package Aug_21;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={8,65,148,4,64,4,34,34};
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

        for (int k:arr){
            System.out.println(k);
        }
    }
}
