package ArrayList;
//Write a program to sort an ArrayList of Strings in descending order.
import java.util.ArrayList;
import java.util.Collections;
public class sortArrayList {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Welcome");
        list.add("to");
        list.add("Antriksh");
        list.add("Facts");
        System.out.println("Original list: "+list);
        Collections.sort(list);
        System.out.println("Sorted list: "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted list in descending order: "+list);
    }
}
