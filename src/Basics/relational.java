package Basics;

public class relational {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        System.out.println(a==b && a<b && a<c);
        System.out.println(a<b && a<c && b<c && a<=c);
        System.out.println(a==b ||a<b || a>b);
        System.out.println(!true);
        System.out.println(!(a==b));
    }
}
