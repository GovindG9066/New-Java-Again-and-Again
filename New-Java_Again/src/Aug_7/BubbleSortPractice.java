package Aug_7;

public class BubbleSortPractice {
    public static void main(String[] args) {
        int[] arr={4,8,66,2,5,4,63,5,22};
        int temp=0;

        for (int i=0;i<arr.length;i++){
            int flag=0;
            for (int j=0;j< arr.length-1-i;j++){
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
        
        String[] arr1={"Jethalal","Babitaji","Natukaka","Tarkamehta","Tapu","Champaklal"};
        String  temp1="";
        
        for (int i=0;i<arr1.length;i++){
            int flag=0;
            for (int j=0;j<arr1.length-1-i;j++){
                if (arr1[j].compareTo(arr1[j+1])>0){
                    temp1=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp1;

                    flag=1;
                }
            }
            if (flag==0){
                break;
            }
        }
        for (int k=0;k<arr1.length;k++){
            System.out.println(arr1[k]);
        }
    }
}
