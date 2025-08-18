package Aug_18;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={4,66,5,84,432,1656,6541};

        int temp,j;

        for (int i=0;i<arr.length;i++){
            temp=arr[i];
            j=i;

            while (j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }

        for (int k=0;k< arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
