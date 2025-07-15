package Practice1;

public class fibUsingRecursion {
    static int first=0,second=1,count=10;
    void printfib(int i){
        if (i==0){
            return;
        }
        int next=first+second;
        System.out.println(next);
        first=second;
        second=next;
        printfib(i-1);
    }
    public static void main(String[] args) {
        fibUsingRecursion obj=new fibUsingRecursion();
        System.out.println(first);
        System.out.println(second);

        obj.printfib(count-2);
    }
}
