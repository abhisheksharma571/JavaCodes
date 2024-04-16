package HashMap;
//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//Each letter in magazine can only be used once in ransomNote
import java.util.HashMap;
public class ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        // Count the occurrences of each letter in magazine.
        for (char c : magazine.toCharArray()) {
            //Yeh loop har character (c) ko magazine string mein iterate karta hai.
            //Hum magazine string ko character array mein convert karte hain toCharArray() method ka istemal karke taaki hum har character ko aasani se iterate kar sakein.
            magazineLetters.put(c, magazineLetters.getOrDefault(c, 0) + 1);
            //Har character c ke liye, hum magazineLetters map mein count update karte hain.
            //Agar character c pehle se map mein maujood hai, toh hum uska count 1 badha dete hain getOrDefault method ka istemal karke jo current count ko retrieve karta hai aur 1 ko usmein add kar deta hai.
            //Agar character c map mein nahi hai, toh hum use map mein add karte hain shuruaati count 1 ke saath.
        }

        // Check if ransomNote can be constructed from magazine.
        for (char c : ransomNote.toCharArray()) {
            if (!magazineLetters.containsKey(c) || magazineLetters.get(c) == 0) {
                // If a letter is not found or not enough occurrences, return false.
                return false;
            }
            magazineLetters.put(c, magazineLetters.get(c) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        ransomNote solution = new ransomNote();
        System.out.println(solution.canConstruct("a", "b")); // false
        System.out.println(solution.canConstruct("aa", "ab")); // false
        System.out.println(solution.canConstruct("aa", "aab")); // true
    }
}