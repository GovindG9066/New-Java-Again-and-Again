package Aug_7;

public class SelectionSortPractice {
    public static void main(String[] args) {
        int[] arr={5,8,6,1,44,55,21,4,654};
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

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



    }
}
