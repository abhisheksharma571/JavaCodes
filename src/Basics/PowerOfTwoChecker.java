package Basics;
//given a number ‘n’, predict whether it is a power of two or not.
public class PowerOfTwoChecker {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        // Count the number of set bits in n
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        // If only one bit is set, it's a power of two
        return count == 1;
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(isPowerOfTwo(15));  // Output: false
        System.out.println(isPowerOfTwo(32));  // Output: true
    }
}

