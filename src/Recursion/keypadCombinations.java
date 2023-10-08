package Recursion;

import java.util.Scanner;

//Given a string digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
//Input: digits="23"
//Output: ["ad","ac","af","bd","bc","bf","cd","cc","cf"]
public class keypadCombinations {
    static void combination(String dig,String[] kp, String res){
        if(dig.length()==0){
            System.out.print(res+" ");
            return;
        }
        int currNum= dig.charAt(0) - '0';
        String currChoices = kp[currNum];

        for(int i=0;i<currChoices.length();i++){
            combination(dig.substring(1),kp,res + currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string from 2-9: ");
        String s = sc.next();

        String[] kp ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //             0  1   2    3      4     5     6     7      8     9
        combination(s,kp,"");
    }
}
