package Sorting_Searching;
//Given an array of positive and negative integers, segregate them in linear time and constant space. The output should print all negative numbers, followed by all positive numbers.
public class sortNegativeToPositive {
    static void display(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
    static void partition(int[] num){
        int l=0, r=num.length-1;
        while(l<r){
            while(num[l]<0)  l++;
            while(num[r]>=0)  r--;
            if(l<r){
                int temp = num[l];
                num[l] = num[r];
                num[r] = temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int[] num = {-13,20,7,0,-4,-13,11,-5,-13};
        partition(num);
        display(num);

    }
}
