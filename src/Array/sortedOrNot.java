package Array;
//is array sorted or not, also sort array and return a array having smallest and largest elements
import java.util.Arrays;
import java.util.Scanner;
public class sortedOrNot {
    static int[] smallestAndLargestElement(int arr[],int k){
        Arrays.sort(arr);       //sort the array
        int[] ans={arr[0],arr[arr.length-1]};      //this array stores first and last element of sorted array
        return ans;
    }
    static int[] kthSmallestAndLargestElement(int arr[],int k){
        Arrays.sort(arr);       //sort the array
        int[] ans2={arr[k-1],arr[arr.length-k]};      //this array stores first and last element of sorted array
        return ans2;
    }
    static boolean isSorted(int[] arr){
        boolean cheak=true;
        for(int i=1;i< arr.length;i++) {
            if (arr[i-1] > arr[i]) {
                cheak=false;
                break;
            }
        }
        return cheak;
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
        System.out.print("Enter the order of which you wanted to print largest and smallest element: ");
        int k=sc.nextInt();
        System.out.println("Is Sorted: "+ isSorted(arr));
        int ans[]=smallestAndLargestElement(arr,k);
        System.out.println("Smallest element: "+ans[0]);
        System.out.println("Largest element: "+ans[1]);
        int ans2[]=kthSmallestAndLargestElement(arr,k);
        System.out.println(k+"th Smallest element: "+ans2[0]);
        System.out.println(k+"th Largest element: "+ans2[1]);
    }
}
