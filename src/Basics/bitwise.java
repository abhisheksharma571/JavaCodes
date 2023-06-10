package Basics;

public class bitwise {
    public static void main(String[] args) {
        int p=9 , q=10;
        System.out.println(p|q); //bitwise or
        System.out.println(p&q); // bitwise and
        System.out.println(p^q); //bitwise xor
        System.out.println(~p);  //bitwise complement
        System.out.println(p<<1); //bitwise left shift by 1 -->      a<<b=a*2^b
        System.out.println(p<<2); //bitwise left shift by 2
        System.out.println(q>>1); //bitwise right shift by 1  -->    a>>b=a/2^b
        System.out.println(q>>2);  //bitwise right shift by 2
    }
}
