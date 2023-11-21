package DynamicProgramming;
//(Fibonacci) - problem on memoization
//memoization - storing each steps(UP-DOWN) to reduce no. of calls
public class memoization {
    static int calls = 0;
    //overlapping sub problem
    private static int fibo(int n, int[] dp){
        if(n==1 || n==0) return 1;
        if(dp[n]  != -1){
            return dp[n];
        }
        calls++;
        return dp[n] = fibo(n-1,dp) + fibo(n-2,dp);
    }
    public static void main(String[] args) {
        int n = 15;
        int[] dp = new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i] = -1;
        }
        System.out.println(fibo(n,dp));
        System.out.println("calls: "+calls);
    }
}
