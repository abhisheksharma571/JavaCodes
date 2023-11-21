package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

//Problem on tabulation :N Stones
/*
There are N stones, numbered 1,2,.....,N. The height of ith stone is h. There is a frog who is initially on Stone 1. He will repeat an action some number
of times to reach Stone N. The action is that if the frog is currently on Stone i, It jumps to one of the following:
Stone i+1,i+2,.....,i+K. Here, a cost of |hi - hj| is incurred, where j is the stone to land on.
Find the minimum possible total incurred before the frog reaches Stone N.
 */
public class NStones {
//    private static int rec(int i, List<Integer> heights, int K, int[] dp){
//        if(i == 0){
//            return 0;
//        }
//        if(dp[i] != -1){
//            return dp[i];
//        }
//        int minCost = 1000;
//        for(int j=1;j<=K;j++){
//            if(i-j >= 0){
//            int jump = Math.abs(heights.get(i) - heights.get(i-j)) + rec(i-j,heights,K,dp);
//            minCost = Math.min(minCost,jump);
//            }
//        }
//        return dp[i] = minCost;
//    }
    public static void main(String[] args) {
        List<Integer> heights = List.of(10,30,40,50,20);
        int K = 3;
        int n = heights.size();
        List<Integer> dp = new ArrayList<>();
        dp.add(0);

        for(int i=1;i<n;i++){
        int minCost = 1000;
            for(int j=1;j<=K;j++){
                if(i-j >= 0){
                    int jump = Math.abs(heights.get(i) - heights.get(i-j)) + dp.get(dp.size()-j);
                    minCost = Math.min(minCost,jump);
                }
            }
            if(dp.size() == K){
                dp.remove(0);
            }
            dp.add(minCost);
        }
        //System.out.println(rec(n-1,heights,K,dp));
        System.out.println(dp.get(K-1));
    }
}
