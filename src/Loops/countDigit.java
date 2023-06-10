package Loops;
//count the number of digits for a given number n
import java.util.Scanner;
public class countDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int count=0;
        int num=sc.nextInt();
        int original_num=num;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("No of digits in "+original_num+"= "+count);
    }
}
