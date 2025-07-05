package Practice;

public class reverseString {
    public static void main(String[] args) {
        String name="Govind";
        System.out.println("Original String :");
        System.out.println("Govind");

        System.out.println("String Reverse :");

        for (int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
