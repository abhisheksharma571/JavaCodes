package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

//Given an array of n integers and a target value x. print whether x exists in the array or not.
public class existOrNotInArray {
    //return array list
    static ArrayList<Integer> allIndicesArray(int[] arr, int n, int idx, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        //base case
        if(idx >= n) return ans;       //return empty arraylist

        //self work
        if(arr[idx] == target)
                ans.add(idx);
        //recursive work
        ArrayList<Integer> smallAns = allIndicesArray(arr,n,idx+1,target);
        ans.addAll(smallAns);
        return ans;
    }
    //return all indices of target if target present in the array, otherwise return -1.
    static void findAllIndices(int[] arr, int n, int idx, int target){
        //base case
        if(idx >= n) return;
        //self work
        if(arr[idx] == target){
            System.out.print(idx+" ");
        }
        //recursive work
        findAllIndices(arr,n,idx+1,target);
    }
    //return first index of target if target present in the array, otherwise return -1.
    static int findIndex(int [] arr, int n, int idx, int x){
        //base case
        if(idx >= n) return -1;
        //self work
        if(arr[idx] == x) return idx;
        //recursive work
        return findIndex(arr,n,idx+1,x);
    }
    static boolean findElement(int [] arr, int n, int idx, int x){
        //base case
        if(idx >= n) return false;
        //self work
        if(arr[idx] == x) return true;
        //recursive work
        return findElement(arr,n,idx+1,x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " elements: ");
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l = arr.length;
        System.out.print("Enter target x: ");
        int x = sc.nextInt();
        if(findElement(arr, l, 0,x)){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        System.out.println("First Index is "+findIndex(arr,l,0,x));

        System.out.print("Indices are: ");
        findAllIndices(arr,l,0,x);
        System.out.println();

        System.out.print("Array list of all indices: ");
        ArrayList<Integer> ans = allIndicesArray(arr,l,0,x);
        for(Integer i: ans){
            System.out.print(i+" ");
        }
    }
}
