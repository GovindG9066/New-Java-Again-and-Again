package First_Package_New_Java_Again;

public class StringReverse {
    public static void main(String[] args) {
        String name="Govind";
        String reverseName="";
        for (int i=name.length()-1;i>=0;i--){
            reverseName+=name.charAt(i);
        }
        System.out.println(reverseName);
    }
}
