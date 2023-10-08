package Array;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int flag = 0;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                flag = 1;
                System.out.println("Not a palindromic array");
                break;
            }
        }
        if(flag==0){
            System.out.println("Palindromic array");
        }
    }
}
