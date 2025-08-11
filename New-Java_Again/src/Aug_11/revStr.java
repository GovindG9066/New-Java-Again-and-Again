package Aug_11;

public class revStr {
    public static void main(String[] args) {
        String name = "Govind";

        System.out.println("Original Name : ");
        System.out.println(name);
        System.out.println();
        System.out.println("Reverse Name : ");
        for (int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }

    }
}
