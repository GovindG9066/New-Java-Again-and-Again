package DADA;

public class variablesType {
    static String StaticVariable="Hello i am static variable";

    String InstanceVariable="Hello i am Instance Variable";

    public void LocalVariable(){
        String LocalV="Hello i am Local Variable";
        System.out.println(LocalV);
    }
    public static void main(String[] args) {
        variablesType VT=new variablesType();
        VT.LocalVariable();
        System.out.println(VT.InstanceVariable);
        System.out.println(variablesType.StaticVariable);

    }
}