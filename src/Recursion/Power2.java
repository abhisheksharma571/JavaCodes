package Recursion;

import java.util.Scanner;

public class Power2 {
    static int pow(int p, int q){
        if(q==0) return 1;
        int smallPow = pow(p,q/2);
        if(q%2==0){
            return smallPow * smallPow;
        }
        return p* smallPow * smallPow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base p: ");
        int p = sc.nextInt();
        System.out.print("Enter power q: ");
        int q = sc.nextInt();
        System.out.println(pow(p,q));
    }
}
