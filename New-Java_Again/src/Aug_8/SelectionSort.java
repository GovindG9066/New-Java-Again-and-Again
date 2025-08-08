package Aug_8;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={7,88,6,55,2,44,6,1,22};

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
            for (int k=0;k<arr.length;k++){
                System.out.println(arr[k]);
            }

    }
}
