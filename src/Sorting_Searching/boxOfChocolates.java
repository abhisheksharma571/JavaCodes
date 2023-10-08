package Sorting_Searching;
//You have 'n' (n<=10^5) boxes of chocolates. Each box contains a[i](a[i]<=10000)  chocolates. You need to distribute these boxes among 'm' students such that the
//maximum number of chocolates allocated to a student is maximum.
//1.One box will be allocated to exactly one student.
//2.All the boxes should be allocated.
//3.Each student has to be allocated at least one box.
//4.Allotment should be in contiguous order, for instance, a student cannot be allocated box 1 and box 3, skipping box 2.
//Calculate and return that minimum possible number. Assume that it is always possible to distribute the chocolates.
//The first line of input will contain th e value of n, the numbers of boxes.
//The second line of input will contain the n numbers denoting the numbers of chocolates in each box.
//The third line will contain the m, number of students.
public class boxOfChocolates {
    static boolean isDivisionPossible(int[] a, int m, int mxChocAllowed){
        int numOfStudents = 1;
        int choc = 0; //number of choc current student has
        for(int i=0; i< a.length; i++){
            if(a[i] > mxChocAllowed) return false;
            if(choc + a[i] <= mxChocAllowed){
                choc += a[i];
            } else {
                numOfStudents++;
                choc = a[i];
            }
        }
        return numOfStudents <= m;
//        if(numOfStudents > m) return false;
//        return true;
    }
    static int distributeChocolates(int[] a, int m){
        if(a.length < m) return -1;
        int ans = 0, st =1, end = (int)1e9;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(isDivisionPossible(a,m,mid)){
                ans = mid;
                end = mid-1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {5,3,1,4,2};
        int m = 3;
        System.out.println(distributeChocolates(a,m));
    }
}
