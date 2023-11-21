package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.List;

//Largest Palindromic number by permuting digits
//Given N(very large), the task is to print the largest palindrome number obtained by permuting the digits of N. If it is not possible to make a palindromic number,
//then print an appropriate message.
public class largestPalindromicNumber {
    public static void main(String[] args) {
        String number = "313551";
        List<Integer> frequency = new ArrayList<>();
        for(int i=0;i<10;i++){
            frequency.add(0);
        }
        int n = number.length();
        for(int i=0;i<n;i++){
            int digit = number.charAt(i) - '0';    //ASCII value
            frequency.set(digit, frequency.get(digit)+1);   //increase frequency by 1
        }
        if(!validate(frequency)){
            System.out.println("Palindrome not possible");
            return;
        }
        //pick in descending order which is greater then 1
        String firstHalf = "";
        for(int i=9;i>=0;i--){
            //first half creation
            while(frequency.get(i) > 1){
                firstHalf += i;
                frequency.set(i, frequency.get(i) - 2);
            }
        }
        StringBuilder sb = new StringBuilder(firstHalf);
        sb.reverse();
        String secondHalf = sb.toString();
        for(int i=9;i>=0;i--){
            if(frequency.get(i) == 1){
                firstHalf += i;
            }
        }
        String result = firstHalf + secondHalf;
        System.out.println(result);
    }
    private static boolean validate(List<Integer> frequency){   //digits present odd times should be 1 or cases to validate palindrome
        boolean isOdd = false;
        for(int i=0;i< frequency.size();i++){
            if(frequency.get(i) % 2 != 0){
                if(isOdd == true){
                    return false;
                }
                isOdd = true;
            }
        }
        return true;
    }
}
