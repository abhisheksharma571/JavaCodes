package Recursion;
import java.util.Scanner;
public class seriesSum {
    static int seriesSum1(int n){
        if(n==0) return 0;
        return seriesSum1(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println(seriesSum1(n));
    }
}
