package Basics;
//given 2 integers a and b.Swap the 2 numbers given using temporary variables
public class swap {
    static void swapping(int a, int b){
        System.out.println("Values before swapping: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Values after swapping: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void main(String[] args) {
        int a=9;
        int b=3;
        swapping(a,b);
    }
}
