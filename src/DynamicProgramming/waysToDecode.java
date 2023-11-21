package DynamicProgramming;
//Problem on Memoization - Ways to Decode
/*
A message containing letters from A-Z can be encoded into numbers using the following mapping: 'A' -> "1", 'B' -> "2",....., 'Z' -> "26".
To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple
ways). For example, "11106" can be mapped into:
"AAJF" with the grouping (1 1 10 6)
"KJF" with the mapping (11 10 6)
Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into "F" since "6" is different from "06".
Given a string s containing only digits, return the number of ways to decode it.
 */
public class waysToDecode {
    static int calls;
    //overlapping sub problem
    //optimal sub structure
    private static int noOfWays(String number, int idx, int[] dp){
        calls++;
        if(idx == 0 || idx == -1){
            return 1;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int not_combined = 0;
        if(number.charAt(idx) != 0){
            //agr wo 0 hoga to wo akela nhi rah sakta
            not_combined =noOfWays(number,idx-1,dp);
        }
        int combined = 0;
        //agr pichle wala 1 hai ya phir curent wala 6 se chhota hai aur pichla wala 2 hai tabhi combine hoga
        if((number.charAt(idx-1) == '1') || (number.charAt(idx-1) == '2' && number.charAt(idx) <= '6')){
            combined = noOfWays(number,idx-2,dp);
        }
        return dp[idx] = not_combined + combined;
    }
    public static void main(String[] args) {
        String number = "11106";
        int n = number.length();
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            dp[i] = -1;
        }
        System.out.println(noOfWays(number,n-1,dp));
        System.out.println("Calls: "+calls);
    }
}
