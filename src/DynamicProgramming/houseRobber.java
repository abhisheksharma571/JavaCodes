package DynamicProgramming;
//Problem on Memoization - House Robber
/*
You are a professional robber planning to rob house along a street. Each house has a certain amount of money stashed, the only constraint stopping you
from robbing each of them is that adjacent house have security systems connected and it will automatically contact police if two adjacent houses were broken into
on the same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 */
public class houseRobber {
    static int calls = 0;
    //overlapping sub problem
    //optimal sub structure
    private static int rob(int[] house, int idx, int[] dp){
        calls++;
        if(idx == house.length-1){
            return house[idx];
        }
        if(idx >= house.length){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int pick = house[idx] + rob(house,idx+2,dp);
        int not_pick = rob(house,idx+1,dp);
        return dp[idx] = Math.max(pick,not_pick);
    }
    public static void main(String[] args) {
        int n = 4;
        int[] houses = new int[n];
        houses[0] = 9;
        houses[1] = 1;
        houses[2] = 3;
        houses[3] = 8;
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            dp[i] = -1;
        }
        System.out.println(rob(houses,0,dp));
        System.out.println("calls: "+calls);
    }
}
