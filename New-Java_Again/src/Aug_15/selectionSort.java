package Aug_15;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={4,55,6,22,3,4,99,5};
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
