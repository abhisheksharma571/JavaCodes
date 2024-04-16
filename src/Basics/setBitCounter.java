package Basics;
//Given a number, count the number of set bits in that number without using an extra space.
//Note : bit ‘1’ is also known as set bit.
public class setBitCounter {
    public static void main(String[] args) {
        // Test cases
        System.out.println(countSetBits(10));  // Output: 2
        System.out.println(countSetBits(15));  // Output: 4
    }

    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            num &= (num - 1); // Flip the least significant set bit to 0
            count++;
        }
        return count;
    }
}
