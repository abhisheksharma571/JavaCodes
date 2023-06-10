package Strings;
import java.util.*;
public class builtInMethods {
    public static void main(String[] args) {
                  //indexOf()-->gives index of character occur at first
                  //charAt()-->gives character at that index
        String str = "Abhishek";
        System.out.println(str.indexOf('h'));
        System.out.println(str.lastIndexOf('h'));
        System.out.println(str.charAt(2));
                 //compareTo()-->compares two string, if both are equal then it returns 0, else return difference between ASCII value of character lexographically
        String gtr = "Sharma";
        System.out.println(str.compareTo(gtr));
                 //contains()-->tells that, that part of string exist or not
        String str1 = "Physics Wallah";
        System.out.println(str1.contains("alla"));
                //startsWith() and endsWith()--> tells String start or ends with that String
        System.out.println(str1.startsWith("Phy"));
        System.out.println(str1.endsWith("Col"));
               //toLowerCase() and toUpperCase()-->convert to lower case and upper case
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
               //concat()-->add two strings
        System.out.println(str.concat(gtr));
        System.out.println(str.concat(" Sharma"));
    }
}
