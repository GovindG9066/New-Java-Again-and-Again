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


        String[] arr1={"Nobita","Shijuka","Doremon","Dekisuki","Jiyan","Sunio"};
        String temp1="";
        int min1;

        for (int i=0;i<arr1.length;i++){
            min1=i;
            for (int j=i+1;j<arr1.length;j++){
                if (arr1[min1].compareTo(arr1[j])>0){
                    min1=j;
                }
            }
            temp1=arr1[i];
            arr1[i]=arr1[min1];
            arr1[min1]=temp1;
        }

        for (int k=0;k<arr1.length;k++){
            System.out.println(arr1[k]);
        }

    }
}
