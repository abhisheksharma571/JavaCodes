package Sorting_Searching;

import java.util.Scanner;

public class linearSearchAlgo {
    public static int linearSearch(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int x = scanner.nextInt();
        int index = linearSearch(arr, n, x);
        if (index != -1) {
            System.out.println("Element " + x + " found at index " + index);
        } else {
            System.out.println("Element " + x + " not found in array");
        }
    }
}
