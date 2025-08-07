package Aug_7;

public class SelectionSortString {
    public static void main(String[] args) {

        String[] arr={"Shijuka","Nobita","Sunio","Dekisuki","Doremon","Jiyan"};
        String temp="";
        int min;

        for (int i=0;i<arr.length;i++){
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[min].compareTo(arr[j])>0){
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
