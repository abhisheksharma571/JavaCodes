package HashMap;

import java.util.HashMap;
import java.util.Map;

public class basics {
    static void hashmapMethods(){
        //Syntax
        Map<String, Integer> mp = new HashMap<>();
        //Adding elements
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);
        //Getting value of a key from the Hashmap
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul"));    //null
        //Updating/Changing value of a key in the Hashmap
        mp.put("Akash",25);
        System.out.println(mp.get("Akash"));
        //Removing a pair from the Hashmap
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("Riya"));     //null
        //Checking if a key is in the Hashmap
        System.out.println(mp.containsKey("Akash"));    //false
        //Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yash",30);     //will not enter
        mp.putIfAbsent("Yashika",30);   //will enter
        //Get all keys in the Hashmap
        System.out.println(mp.keySet());
        //Get all values in the Hashmap
        System.out.println(mp.values());
        //Get all entries in the hashmap
        System.out.println(mp.entrySet());
        //Traversing all entries of Hashmap - multiple methods
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }
    public static void main(String[] args) {
        hashmapMethods();
    }
}
