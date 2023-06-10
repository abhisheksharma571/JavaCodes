package Strings;
import java.util.*;
public class interning {
    public static void main(String[] args) {
        String s= "Hello";
        String x= "Hello";                            //points at same memory
        String y = new String("Hello");        //creates a different memory
        x="Mello";
        y= "Lello";
        System.out.println(x);
        System.out.println(s);
        System.out.println(y);
        //immutability--> s.charAt(0) ='D';   this is wrong
        s =s.substring(0,2)+'y'+ s.substring(3);
        System.out.println(s);
    }
}
