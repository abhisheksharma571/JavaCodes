package Recursion;

import java.util.Scanner;

public class Power {
    static int pow(int p, int q){
        if(q==0) return 1;
        return pow(p,q-1)*p;
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
