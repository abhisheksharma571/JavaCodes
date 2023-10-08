package Sorting_Searching;

public class countSortAlgo {
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static void display(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
    static void basicCountSort(int[] arr){
        int max = findMax(arr); //find the largest element of the array
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k = 0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++] = i;
            }
        }
    }
    static void countSort(int[] arr){     //this will maintain stability
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr); //find the largest element of the array
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++){       //make frequency array
            count[arr[i]]++;
        }
        //make prefix sum array of count array
        for(int i=1;i<count.length;i++){
            count[i] += count[i-1];
        }
        //find the index of each element in the original array and put it in output array
        for(int i=n-1;i>=0;i--){
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        //copy all elements of output to arr
        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,2,5};
        basicCountSort(arr);
        display(arr);
        System.out.println();
        countSort(arr);
        display(arr);
    }
}
