package HashMap;

import java.util.HashMap;
import java.util.Scanner;

//Check whether two Strings are anagram of each other. Return true if they are else return false. An anagram of a string is another string that
//contains the same characters, only the order of characters can be different.
public class validAnagram {
    static HashMap<Character, Integer> makeFreqMap(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            } else {
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq+1);
            }
        }
        return mp;
    }
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> mp1 = makeFreqMap(s);
        HashMap<Character, Integer> mp2 = makeFreqMap(t);
        return mp1.equals(mp2);
    }
    public static boolean isAnagramSpaceOptimised(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> mp = makeFreqMap(s);
        for(int i=0;i<t.length();i++){
            Character ch = t.charAt(i);
            if(!mp.containsKey(ch)) return false;
            int currFreq = mp.get(ch);
            mp.put(ch, currFreq-1);
        }
        //all values in map should be 0 for s and t to be anagram
        for(Integer i : mp.values()){
            if(i!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.next();
        System.out.print("Enter second string: ");
        String t = sc.next();
        System.out.println("Is it Anagram? "+isAnagram(s,t));
        System.out.println("Space Optimised approach: Is it Anagram? "+isAnagramSpaceOptimised(s,t));
    }
}
