package Aug_15;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr={15,8,6,33,7,52};
        int temp=0;

        for (int i=0;i<arr.length;i++){
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
            for (int k=0;k<arr.length;k++){
                System.out.println(arr[k]);
            }
    }
}
