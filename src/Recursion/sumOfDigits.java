package Recursion;

import java.util.Scanner;

public class sumOfDigits {
    static int digitSum(int n){
        if(n>=0 && n<=9) return n;
        return digitSum(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitSum(n));
    }
}
