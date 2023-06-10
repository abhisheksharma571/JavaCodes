package Loops;
//reverse the digits of a number
import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        int original_n=n;
        int reverse=0;
        while(n>0){
            reverse=reverse*10+n%10;
            n/=10;

        }
        System.out.println("Reverse of "+original_n+" = "+reverse);
    }
}
