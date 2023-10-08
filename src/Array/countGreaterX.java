package Array;

import java.util.Scanner;

public class countGreaterX {
    static int countOccurence(int[] arr,int x){
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter x: ");
        int x=sc.nextInt();
        System.out.print("number of elments greter than x: "+ countOccurence(arr,x));
    }
}
