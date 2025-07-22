package allPrograms;

public class fab {
    public static void main(String[] args) {
        int first=0;
        int second=1,count=10;
        System.out.println(first);
        System.out.println(second);

        for (int i=2;i<=count-1;i++){
            int next=first+second;
            System.out.println(next);
            first=second;
            second=next;
        }
    }
}
