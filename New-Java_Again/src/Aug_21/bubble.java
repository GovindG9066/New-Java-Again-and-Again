package Aug_21;

public class bubble {
    public static void main(String[] args) {
        int[] arr={45,8,464,35,451,454,45};
        int temp=0;

        for (int i=0;i< arr.length;i++){
            int flag=0;
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    flag+=1;

                }
            }
                if (flag==0){
                    break;
            }
        }
            for (int k:arr){
                System.out.println(k);
            }
    }
}
