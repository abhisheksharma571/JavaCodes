package Recursion;

import java.util.Scanner;

public class multiples {
    static void printMultiples(int n, int k){
        if(k==0) return;
        printMultiples(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter k(no. of multiples): ");
        int k = sc.nextInt();
        printMultiples(n,k);
    }
}
