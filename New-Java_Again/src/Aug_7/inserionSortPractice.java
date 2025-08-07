package Aug_7;

public class inserionSortPractice {
    public static void main(String[] args) {
        int[] arr={7,99,4,66,25,134,5};
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
