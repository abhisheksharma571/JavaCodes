package Basics;
//Given a number. Using bit manipulation, check whether it is odd or even.
public class oddEvenCheckByBit {
    public static String checkOddEven(int num) {
        // Check if the LSB of the number is 1 (odd) or 0 (even)
        if ((num & 1) == 1) {
            return "Odd";
        } else {
            return "Even";
        }
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(checkOddEven(8));  // Output: Even
        System.out.println(checkOddEven(3));  // Output: Odd
    }
}

