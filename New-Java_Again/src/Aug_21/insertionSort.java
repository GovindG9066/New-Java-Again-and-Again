package Aug_21;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={465,8,41,65,1654,16,31};
        int temp,original;

        for (int i=1;i< arr.length;i++){
            temp=arr[i];
            original=i;

            while (original>0 && arr[original-1]>temp){
                arr[original]=arr[original-1];
                original--;
            }
            arr[original]=temp;
        }

        for (int k:arr){
            System.out.println(k);
        }
    }
}
