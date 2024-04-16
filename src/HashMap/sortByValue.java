package HashMap;

import java.util.*;

public class sortByValue {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Rahul", 5);
        map.put("Lakshman", 7);
        map.put("Ram", 1);
        map.put("Krrish", 4);
        map.put("Lakshay", 2);

        System.out.println("Sorted Map by Value:");
        System.out.println(map);
    }
}
