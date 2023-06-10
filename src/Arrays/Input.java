package Arrays;
import java.util.Scanner;
public class Input {
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
//        arr[0]=sc.nextInt();
//        arr[1]=sc.nextInt();
//        arr[2]=sc.nextInt();
//        arr[3]=sc.nextInt();
//        arr[4]=sc.nextInt();
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array: ");
       printArray(arr);
        //trying to copy arr to arr_2
        System.out.print("Copied array: ");
        int[] arr_2=arr;
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
