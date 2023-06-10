package Strings;
import java.util.*;      //imported all packages
public class stringsBasic {
    public static void main(String[] args) {
        String str = "Antriksh Facts";
        System.out.println(str);
        //taking input
        Scanner sc = new Scanner(System.in);
//        String s = sc.next();      //it takes only one word input
//        String s = sc.nextLine();   //it takes multiple words input
//        System.out.println(s);

        //length method
//        int len = str.length();
//        System.out.println(len);
                  //OR
        System.out.println(str.length());

        //to get character at index i
        char ch = str.charAt(3);
        System.out.println(ch);
                  //OR
        System.out.println(str.charAt(4));

    }
}
