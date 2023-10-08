package Recursion;

import java.util.Scanner;

//Given two number x and y. Find the greatest common divisor of x and y using recursion.
public class GCD {
    static int iGCD(int x, int y){
        while(x%y!=0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return y;
    }
    static int iGCDrecursion(int x, int y){
        if(y==0) return x;
        return iGCDrecursion(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(iGCD(x,y));
        System.out.println(iGCDrecursion(x,y));

    }
}
