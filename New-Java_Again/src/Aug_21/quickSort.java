package Aug_21;

public class quickSort {
    public static int partiation(int arr[],int si,int ei){
        int idx=si-1,pivot=arr[ei];

        for (int j=si;j<ei;j++){
            if (arr[j]<=pivot){
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;

            }
        }
        idx++;
        arr[idx]=arr[ei];
        return idx;
    }
    public static void quick(int arr[],int si,int ei){
        if (si<ei){
            int pivotid=partiation(arr,si,ei);
            quick(arr,si,pivotid-1);
            quick(arr,pivotid+1,ei);
        }

    }
    public static void main(String[] args) {
        int[] arr={56,95,6,5,45,9,49,4,64,1};
        int len= arr.length;
        quick(arr, 0, len - 1);

    }
}
