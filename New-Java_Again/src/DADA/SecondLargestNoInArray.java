package DADA;

public class SecondLargestNoInArray {
    public void SecondLargestNo(){
        int arr[]={10,85,35,64,12};
        int sortedarr[]=new int[5];
        int largest=arr[0];
        for (int i=0;i< arr.length-1;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        int second=Integer.MIN_VALUE;
        for (int i=0;i< arr.length-1;i++){
            if (arr[i]!=largest && arr[i]>second){
                second=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println("Second :"+second);
    }
    public static void main(String[] args) {
        SecondLargestNoInArray LNO=new SecondLargestNoInArray();
        LNO.SecondLargestNo();
    }
}
