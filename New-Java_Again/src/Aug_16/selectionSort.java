package Aug_16;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={44,7,66,5,99,22,55,66};
        int min;
        int temp=0;

        for (int i=0;i<arr.length-1;i++){
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[min]>arr[j]){
                    min=j;
                }

                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }


        }
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
