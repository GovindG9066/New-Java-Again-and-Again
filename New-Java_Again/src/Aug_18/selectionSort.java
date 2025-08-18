package Aug_18;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={4,66,896,6,654,49,645,45};
        int temp=0,min;

        for (int i=0;i<arr.length;i++){
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
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
