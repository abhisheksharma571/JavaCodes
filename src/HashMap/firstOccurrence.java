package HashMap;

import java.util.HashMap;
import java.util.Scanner;

//First non-repeating character in a string
public class firstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else map.put(ch, 1);
        }
        int result = -1;
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i)) == 1){
                System.out.println("The first non-repeating character is present at index: "+ i);
                result = 1;
                break;
            }
        }
        if(result == -1){
            System.out.println("No non-repeating character is present in the String");
        }
    }
}
