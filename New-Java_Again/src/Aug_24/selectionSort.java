package Aug_24;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={456,8,65,2,5,49,45};
        int temp=0,min;

        for (int i=0;i< arr.length;i++){
            min=i;
            for (int j=i;j< arr.length;j++){
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
