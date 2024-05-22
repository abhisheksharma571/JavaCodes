package Stacks;
// Given an encoded string, return its decoded string. The encoding rule is: k[encoded_string],
// where the encoded_string inside the square brackets is being repeated exactly k times.
// Note that k is guaranteed to be a positive integer. You may assume that the input string is always valid;
// there are no extra white spaces, square brackets are well-formed, etc.
// Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k.
// For example, there will not be input like 3a or 2[4].

import java.util.Stack;

public class decodeString {
    public static String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();
        String res = "";
        int index = 0;

        while(index < s.length()) {
            if(Character.isDigit(s.charAt(index))){
                int count = 0;
                while(Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                counts.push(count);
            } else if(s.charAt(index) == '['){
                result.push(res);
                res = "";
                index++;
            } else if(s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(result.pop());
                int count = counts.pop();
                for(int i = 0; i < count; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                index++;
            } else {
                res += s.charAt(index);
                index++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String input1 = "3[a]2[bc]";
        String input2 = "3[a2[c]]";
        String input3 = "2[abc]3[cd]ef";

        System.out.println(decodeString(input1)); // Output: "aaabcbc"
        System.out.println(decodeString(input2)); // Output: "accaccacc"
        System.out.println(decodeString(input3)); // Output: "abcabccdcdcdef"
    }
}
