package Loops;
//find the sum of the following series S= 1-2+3-4......n
import java.util.Scanner;
public class sumOfSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. till you want sum: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
            else sum-=i;
        }
        System.out.println("Sum is "+ sum);
    }
}
