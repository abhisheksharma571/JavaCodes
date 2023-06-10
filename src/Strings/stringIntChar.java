package Strings;
import java.util.*;
public class stringIntChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        str = str + "def";
        System.out.println(str);
        str += 'g';
        System.out.println(str);
        str += 123;
        System.out.println(str);
        System.out.println(10+20+"abc"+"xyz"+'r'+10+20);

    }
}
