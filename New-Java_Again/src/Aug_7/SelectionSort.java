package Aug_7;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={12,8,66,5,44,3,2,1};
        int min;
        int temp=0;

        for (int i=0;i<arr.length;i++){
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
