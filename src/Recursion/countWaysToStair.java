package Recursion;
//One can only climb 1 or 2 stairs in one step, find the no of ways to climb the stairs, if no of stairs is given.
import java.util.Scanner;

public class countWaysToStair {
    static int countWays(int n){
        int result = 0;
        if(n<=1) return n;
        else result = countWays(n-1) + countWays(n-2);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Stairs: ");
        int n = sc.nextInt();
        int result = countWays(n+1);
        System.out.println("No of ways to climb the stairs is: "+result);
    }
}
