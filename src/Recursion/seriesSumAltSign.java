package Recursion;

import java.util.Scanner;

//Given a number n. Find the sum of natural numbers till n but with alternate signs.
//that means if n=5 then you have to return 1-2+3-4+5=3 as your answer.
public class seriesSumAltSign {
    static int seriesSum2(int n){
        if(n==0) return 0;
        if(n%2==0) return seriesSum2(n-1) - n;
        return seriesSum2(n-1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(seriesSum2(n));

    }
}
