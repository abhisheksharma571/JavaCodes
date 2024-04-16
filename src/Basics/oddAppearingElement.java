package Basics;

public class oddAppearingElement {
    public static int find_odd_element(int arr[]){
        int result = 0;
        for(int i=0;i<arr.length;i++){
            result ^= arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
        int odd_element = find_odd_element(arr);
        System.out.println("The odd occurring element is "+ odd_element);
   }
}
