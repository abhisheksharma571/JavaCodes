package DynamicProgramming;
//Problem on tabulation : 0/1 Knapsack  : TC:O(n*W), SC:O(W)
//We are given N items where each item has some weight and profit associated with it. We are also given a bag with capacity W, [i.e. the bag can hold
//at most W weight in it]. The target is to put the items into the bag such that the sum of profits associated with them is the maximum possible.

import java.util.List;

public class knapsack0by1 {
//    private static int rec(int idx, int W,List<Integer> profit, List<Integer> weights, int[][] dp){
//        if(dp[idx][W] != -1){
//            return dp[idx][W];
//        }
//        if(idx==0){
//            if(weights.get(0) <= W){
//                return profit.get(0);
//            } else {
//                return 0;
//            }
//        }
//        int pick = 0;
//        if(W >= weights.get(idx)){
//            pick = profit.get(idx) + rec(idx-1,W - weights.get(idx),profit,weights,dp);
//        }
//        int notPick = rec(idx-1,W,profit,weights,dp);
//        return dp[idx][W] = Math.max(pick,notPick);
//    }
    public static void main(String[] args) {
        List<Integer> profit = List.of(1,2,3);
        List<Integer> weights = List.of(4,5,1);
        int Wt = 4;
        int n = profit.size();
        int[] prev = new int[Wt+1];
        int[] curr = new int[Wt+1];
//        int[][] dp = new int[n+1][Wt+1];
        for(int i=0;i<=Wt;i++){
            curr[i] = 0;
                if(weights.get(0) <= i){
                    prev[i] = profit.get(0);
                } else {
                    prev[i] = 0;
                }
        }

        for(int idx=1;idx<n;idx++){
            for(int W=0;W<=Wt;W++){
                int pick = -1000;
                if(W >= weights.get(idx)){
                    pick = profit.get(idx) + prev[W - weights.get(idx)];
                }
                int notPick = prev[W];
                curr[W] = Math.max(pick,notPick);
            }
            System.arraycopy(curr,0,prev,0,Wt+1);    //deep copy
        }

//        for(int i=0;i<=n;i++){
//            for(int j=0;j<=W;j++){
//                dp[i][j] = -1;
//            }
//        }
       // System.out.println(rec(n-1,W,profit,weights,dp));
       System.out.println(prev[Wt]);
    }
}
