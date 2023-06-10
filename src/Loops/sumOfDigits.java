package Loops;
//find the number of digits in a given number n
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter any number: ");
        int sum=0;
        int n=sc.nextInt();
        int original_n=n;
        while(n>0){
            sum += n%10;
            n=n/10;
        }
        System.out.println("Sum of digits of "+ original_n +" = "+ sum);
    }
}
