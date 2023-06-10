package Strings;
import java.util.*;
public class equals {
    public static void main(String[] args) {
        //in string constant pool area in heap memory
        String s1 = "Hello";
        String s2 = "Hello";
        String str = "hello";
        //in normal area in heap memory
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        //== compares reference of the string
        System.out.println(s1==str);        //gives false because both refers different object
        System.out.println(s1==s2);        //gives true because both points at same address
        System.out.println(s1==s3);        //gives false because both are at different address
        System.out.println(s4==s3);        //gives false because both are at different address

        //.equals() compares content of the string
        System.out.println(s1.equals(s2));   //gives true
        System.out.println(s1.equals(s3));  //gives true
        System.out.println(s1.equals(str));
        System.out.println(s1.equalsIgnoreCase(str));     //ignores case
    }
}
