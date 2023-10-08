package Recursion;

import java.util.Scanner;

//Find the no. of ways to climb the stairs if you can only climb one or two stairs at a time
public class countWaysToStairs {
    //function definition
    public static int countNum(int n){
        int result = 0;
        if(n<=1){
            return n;
        }
        else{
            result = countNum(n-1)+countNum(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of stairs: ");
        int n = sc.nextInt();
        //function calling
        int result = countNum(n+1);
        System.out.println("Number of ways to climb stairs is : "+result);
    }
}
