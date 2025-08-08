package Aug_8;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={4,8,66,1,5,22,45,6,45};
        int j,temp;

        for (int i=1;i<arr.length;i++){
            j=i;
            temp=arr[i];
            while (j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;

            }
            arr[j]=temp;
        }
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
