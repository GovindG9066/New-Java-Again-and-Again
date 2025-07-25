package Arrays_In_Java;

public class anonymous_Array {
    public static void main(String[] args) {

        anonymous_Array.sum(new int[]{10,20,30});
    }
    static void sum(int[] num){
        int total=0;
        for (int i:num){
            total+=i;
        }
        System.out.println(total);
    }
}
