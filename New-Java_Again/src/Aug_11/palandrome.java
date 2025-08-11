package Aug_11;

public class palandrome {
    public static void main(String[] args) {
        int num=15351;
        int original=num;
        int rev=0;
       while (num!=0){
           int digit=num%10;
           rev=10*rev+digit;
           num/=10;
       }

       if (original==rev){
           System.out.println("Yes,"+original+" is palandrome Number");
       }else {
           System.out.println("No,"+original+" is Not an Palandrome Number ");
       }
    }
}
