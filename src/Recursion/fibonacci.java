package Recursion;

import java.util.Scanner;

public class fibonacci {
    static int calculateFibonacci(int n){
        //base case
        if(n==0 || n==1)  return n;
        //sub-problems: recursive work
//        int prev = calculateFibonacci(n-1);
//        int prevPrev = calculateFibonacci(n-2);
        //self work
        return calculateFibonacci(n-1) + calculateFibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(calculateFibonacci(i)+" ");
        }
    }
}
