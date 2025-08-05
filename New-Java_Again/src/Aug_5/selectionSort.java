package Aug_5;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={45,7,6,22,1,55};
        int temp=0;
        int min;

        for (int i=0;i<arr.length;i++){
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[i]){
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
