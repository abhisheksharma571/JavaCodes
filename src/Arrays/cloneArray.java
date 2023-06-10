
package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class cloneArray {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array: ");
        printArray(arr);
        //trying to copy arr to arr_2
        System.out.print("Copied array: ");
//        int[] arr_2=arr.clone();   //cloning of array-->deep copy  OR
//        int[] arr_2= Arrays.copyOf(arr,arr.length);      //deep copy-->present in java.util.Arrays-->copies only till those elements which length you enter here
        //OR
        int[] arr_2=Arrays.copyOfRange(arr,0,arr.length);   //it copies from the range you entered
        printArray(arr_2);
        //changing some values of arr_2
        arr_2[0]=0;
        arr_2[1]=1;
        System.out.print("Original array after changing: ");
        printArray(arr);
        System.out.print("Copied array after changing: ");
        printArray(arr_2);
    }
}
