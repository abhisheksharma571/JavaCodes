package Recursion;

import java.util.Scanner;

public class factorial {
    static int calculateFactorial(int n){
        //base case
        if(n==0) return 1;
        //recursive work
//        int fact = calculateFactorial(n-1);
        //self work
//        int ans = n*fact;
        return n*calculateFactorial(n-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calculateFactorial(n));
    }
}
