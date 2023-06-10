package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
//method 2:write a program to Reverse the given ArrayList
public class reverseArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List: "+ list);
        Collections.reverse(list);
        System.out.println("Reversed List: "+ list);
        Collections.sort(list);                                  // sort in ascending order
        System.out.println("Ascending List: "+ list);
        Collections.sort(list,Collections.reverseOrder());      // sort in descending order
        System.out.println("Descending List: "+ list);
    }
}
