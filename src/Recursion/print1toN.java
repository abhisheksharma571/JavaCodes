package Recursion;

import java.util.Scanner;

public class print1toN {
    static void printNumbers(int n){
        //base case
        if(n==1){
            System.out.println(1);
            return;
        }
        //recursive work
        printNumbers(n-1);
        //self work
        System.out.println(n);
    }
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n);
    }
}
