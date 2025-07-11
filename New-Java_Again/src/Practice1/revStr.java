package Practice1;

public class revStr {
    public static void main(String[] args) {
        String name="Govind";
        System.out.println(name);

        for (int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
