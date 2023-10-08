package Recursion;

import java.util.Scanner;

public class printNto1 {
    static void printNumbers(int n){
        //base case
        if(n==1){
            System.out.println(1);
            return;
        }
        //self work
        System.out.println(n);
        //recursive work
        printNumbers(n-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n);
    }
}