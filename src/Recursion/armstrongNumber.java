package Recursion;

public class armstrongNumber {
    static boolean isArmstrong(int number){
        int originalNumber = number;
        int totalDigits = String.valueOf(number).length();  //converts the integer number into its string representation
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, totalDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
    public static void main(String[] args) {
        int number = 153;
        System.out.println(number + " is Armstrong number? " + isArmstrong(number));
    }
}
