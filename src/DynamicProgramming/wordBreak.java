package DynamicProgramming;

import java.util.List;

//Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
//The same word in the dictionary may be reused multiple times in the segmentation.
public class wordBreak {
    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = List.of("cats", "dog", "sand", "and", "cat");
        int n = s.length();
        int[] dp = new int[n+1];
        //base condition
        dp[n] = 1;
        for(int idx=n-1;idx>=0;idx--){
            for(int i = idx;i<s.length();i++){
                String prefix = s.substring(idx, i+1);
                if(wordDict.contains(prefix)) {
                    //suffix pe recursion
                    if (dp[i + 1] == 1) {
                        dp[idx] = 1;
                    }
                }
            }
        }

        System.out.println(dp[0]);
    }
}
