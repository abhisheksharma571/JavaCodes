package Assigmnent;

public class peakElement {
    public static void main(String[] args) {
        int arr[]=  {1,8,2,6,5};
        int peak = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i>0 && i<arr.length-1){
                if (arr[i]>arr[i-1] && arr[i]>arr[i+1] && arr[i]>peak) {
                        peak = arr[i];
                }
            }
        }
        System.out.println(peak);
    }
}