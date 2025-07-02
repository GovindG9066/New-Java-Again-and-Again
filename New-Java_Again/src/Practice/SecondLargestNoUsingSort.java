package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestNoUsingSort {
    public static void main(String[] args) {
        int arr[]={10,52,64,82,35};
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println("Second Largest No in Array is : "+arr[arr.length-2]);
    }
}
