package Aug_1;

public class array {
    public static void main(String[] args) {
        int[] arr={10,60,4,30,8,45};
        int sum=0;
        System.out.println("Size of array : ");
        System.out.println(arr.length);

        System.out.println("array : ");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Sum of array : ");
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

        System.out.println("Maximul of the arr : ");
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
            System.out.println(max);

        System.out.println("Minimum : ");
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);

        int avgsum=0;

        System.out.println("Avg : ");
        for (int i=0;i<arr.length;i++){
            avgsum+=arr[i];
        }
        System.out.println(avgsum/2);

    }
}
