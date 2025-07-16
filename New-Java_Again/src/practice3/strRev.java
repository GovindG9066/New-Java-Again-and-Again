package practice3;

public class strRev {
    public static void main(String[] args) {
        String name="Govind";
        System.out.println(name);

        for (int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
