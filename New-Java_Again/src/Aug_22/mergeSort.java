package Aug_22;

public class mergeSort {
    public static void conquer(int arr[],int si,int mid,int ei){
        int merge[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while (idx1<=mid && idx2<=ei){
            if (arr[idx1]<=arr[idx2]){
                merge[x++]=arr[idx1++];
            }else {
                merge[x++]=arr[idx2++];
            }
        }

        while (idx1<=mid){
            merge[x++]=arr[idx1++];
        }
        while (idx2<=ei){
            merge[x++]=arr[idx2++];
        }

        for (int i=0,j=si;i<merge.length;i++,j++){
            arr[j]=merge[i];
        }
    }
    public static void divide(int arr[],int si,int ei){
        if (si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);

        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr[]={45,4,6,6,8,4,51,352,13};
        int len=arr.length;

        divide(arr,0,len-1);

        for (int i:arr){
            System.out.println(i);
        }
    }
}
