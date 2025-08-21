package Aug_21;

public class bubble {
    public static void main(String[] args) {
        int[] arr={45,8,464,35,451,454,45};
        int temp=0;

        for (int i=0;i< arr.length;i++){
            int flag=0;
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

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
