package DynamicProgramming;
/*
Longest Common Subsequence: TC:O(m*n), SC:O(n)
Given two strings, S1 and S2, the task is to find the length of the longest subsequence present in both of the strings.
A subsequence of a string is a sequence that is generated by deleting some characters(possibly 0) from the string without altering the order of the
remaining characters. For example, "abc","abg","bdf","aeg","acefg",etc. are subsequences of the string "abcdefg".
 */
public class longestCommonSubsequence {
//    private static int rec(String s1, String s2, int i, int j, int [][]dp){
//        if(i==0 || j==0)
//            return 0;
//        if(dp[i][j] != -1)
//            return dp[i][j];
//        if(s1.charAt(i-1) == s2.charAt(j-1)){
//            //match
//            return dp[i][j] = 1 + rec(s1, s2, i-1, j-1, dp);
//        }
//        //not match
//        return dp[i][j] = Math.max(rec(s1, s2, i-1, j, dp), rec(s1, s2, i, j-1, dp));
//    }
    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        int m = s1.length();
        int n = s2.length();
//        int [][]dp = new int[m+1][n+1];
        int[] curr = new int[n+1];
        int[] prev = new int[n+1];
        for(int j=0;j<=n;j++){
            prev[j] = 0;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    //match
                    curr[j] = 1 + prev[j-1];
                } else {   //not match
                    curr[j] = Math.max(prev[j], curr[j-1]);
                }
                prev = curr;

            }
        }
        System.out.println(prev[n]);
    }
}
