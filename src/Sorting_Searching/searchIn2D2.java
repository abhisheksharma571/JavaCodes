package Sorting_Searching;

public class searchIn2D2 {


/*Search the target value in a 2D integer matrix of dimensions n*m and return true if found, else return false. This matrix has the following properties.
1.Integers in each row are sorted from left to right.
2.Integers in each column are sorted in ascending from top to bottom.
*/
    static boolean searchMatrix2(int[][] a, int target){
        //number of rows = n, number of columns = m
        int n = a.length, m = a[0].length;
        int i = 0, j = m-1;
        while(i<n && j>=0){
            if(a[i][j] == target) return true;
            if(target < a[i][j]){
                j--;    //move left
            }
            else {
                i++;   //move down
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[][] = {{1,4,7,11,15},
                    {2,5,8,12,19},
                    {3,6,9,16,22},
                    {10,13,14,17,24},
                    {18,21,23,26,30}};
        int target = 14;
        System.out.println(searchMatrix2(a,target));
    }
}
