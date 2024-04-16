package DynamicProgramming;

import java.util.List;

//problem on tabulation - Coin Change : TC:O(n*sum), SC:O(sum)
//Given an integer array of coins[] of size N representing different types of currency and an integer sum, the task is to find the number of ways to
//make sum by using different combinations from coins[]. Assume that you have an infinite supply of each type of code.
public class coinChange {
    //  By Recursion:-
//    private static int rec(List<Integer> coins, int sum, int idx, int[][] dp){
//        if(dp[idx][sum] != -1){
//            return dp[idx][sum];
//        }
//        if(idx == 0){
//            if(sum % coins.get(idx) == 0){    //if sum is multiple of coin then 1 possibility exist
//                return 1;
//            } else {
//                return 0;
//            }
//        }
//        int pick = 0;
//        if(sum >= coins.get(idx)){       //coin will pick only when sum is greater or equal than coin
//            pick = rec(coins,sum - coins.get(idx),idx,dp);
//        }
//        int notPick = rec(coins,sum,idx-1,dp);
//        return dp[idx][sum] =  pick + notPick;
//    }
    public static void main(String[] args) {
        List<Integer> coins = List.of(1,2,3);
        int totalSum = 4;
        int n = coins.size();
        //Memoize it:-
  //      int[][] dp = new int[n+1][totalSum+1];
//        for(int i=0;i<=n;i++){
//            for(int j=0;j<=W;j++){
//                dp[i][j] = -1;
//            }
//        }

        //use base condition to build dp array:-

//        for(int i=0;i<=totalSum;i++){
//            if(i % coins.get(0) == 0){
//                dp[0][i] = 1;
//            } else {
//            dp[0][i] = 0;
//            }
//        }
        int[] curr = new int[totalSum+1];
        int[] prev = new int[totalSum+1];
        for(int i=0;i<=totalSum;i++){
            curr[i] = 0;
            if(i % coins.get(0) == 0){
                prev[i] = 1;
            } else {
                prev[i] = 0;
            }
        }
        for(int idx=1;idx<n;idx++){
            for(int sum=0;sum<=totalSum;sum++){
                int pick = 0;
                //use recurrence relation on your dp array and space optimize this :-
                if(sum >= coins.get(idx)){       //coin will pick only when sum is greater or equal than coin
                    pick = curr[sum - coins.get(idx)];
                }
                int notPick = prev[sum];
                curr[sum] =  pick + notPick;
            }
            prev = curr;
        }
        //System.out.println(rec(coins,totalSum,n-1,dp));
        System.out.println(prev[totalSum]);
    }
}
