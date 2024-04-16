package Array;
//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//Each letter in magazine can only be used once in ransomNote

//This code defines a Solution class with a canConstruct method that uses an array of size 26 to count the occurrences of each lowercase English letter
// in magazine. It then iterates through ransomNote to ensure each character can be found in magazine with sufficient quantity.
// The main method demonstrates the function with the given examples. This approach is more space-efficient than using a HashMap when the
// character set is known and limited.
public class ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letterCounts = new int[26]; // Array to hold counts of each letter.

        // Count the occurrences of each letter in magazine.
        for (char c : magazine.toCharArray()) {
            letterCounts[c - 'a']++;
        }

        // Check if ransomNote can be constructed from magazine.
        for (char c : ransomNote.toCharArray()) {
            if (--letterCounts[c - 'a'] < 0) {
                // If a letter is not found or not enough occurrences, return false.
                return false;
            }
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