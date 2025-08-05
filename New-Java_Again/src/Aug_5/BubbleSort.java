package Aug_5;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={10,45,6,23,7,9,5};

        int temp=0;

        for (int i=0;i<=arr.length;i++){
            int flag=0;
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    flag=1;
                }
            }
            if (flag==0){
                break;
            }
        }
        for (int k=0;k<=arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
