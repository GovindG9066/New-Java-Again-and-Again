package Practice1;

public class swipeNoWithoutUsingVariable {
    public static void main(String[] args) {
        int first=66,second=3;
        System.out.println("Before :");

        System.out.println(first);
        System.out.println(second);

        first=first+second;
        second=first-second;
        first=first-second;

        System.out.println("After :");

        System.out.println(first);
        System.out.println(second);
    }
}
