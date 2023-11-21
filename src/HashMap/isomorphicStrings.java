package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//Given two Strings s and t, determine if they are isomorphic. Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same
//characters, but a character may mao to itself.
public class isomorphicStrings {
    public static boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> mp = new HashMap<>();
        HashSet<Character> st = new HashSet<>();
        for(int i=0;i<s.length();i++){
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);
            if(mp.containsKey(sCh)){
                if(mp.get(sCh) != tCh) return false;
            } else if(st.contains(tCh)){
                return false;
            } else {
                mp.put(sCh, tCh);
                st.add(tCh);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.next();
        System.out.print("Enter second string: ");
        String t = sc.next();
        System.out.println("Is it Isomorphic? "+isIsomorphic(s,t));
    }
}
