package Aug_7;

public class practiceSelectionSort {
    public static void main(String[] args) {
        int[] arr={4,88,6,22,5,4,8,3,5};
        int temp=0;
        int min;

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

        for (int k:arr){
            System.out.println(k);
        }
    }
}
