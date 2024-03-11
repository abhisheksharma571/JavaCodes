package Array;

import java.util.Arrays;

public class duplicateElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,9};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                System.out.println("Duplicate element is : "+ arr[i]);
            }
        }
    }
}
