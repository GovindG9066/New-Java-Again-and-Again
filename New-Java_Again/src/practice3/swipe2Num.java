package practice3;

public class swipe2Num {
    public static void main(String[] args) {
        int firstNo=55,secondNo=99;
        System.out.println(firstNo);
        System.out.println(secondNo);

        firstNo=firstNo+secondNo;
        secondNo=firstNo-secondNo;
        firstNo=firstNo-secondNo;

        System.out.println(firstNo);
        System.out.println(secondNo);
    }
}
