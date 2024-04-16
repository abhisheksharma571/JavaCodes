package DynamicProgramming;
//Edit str1 to make str2 :
//Given two strings str1 and str2 and below operations that can be performed on str1. Find the minimum number of edits (operations) required to convert
//str1 to str2.
//1.Insert 2.Remove
//All of the above operations are of equal cost.
public class str1toStr2 {
    public static void main(String[] args) {
        String s1 = "SUNDAY";
        String s2 = "SATURDAY";
        int m = s1.length();
        int n = s2.length();
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
        int lcs_length = prev[n];
        System.out.println((s1.length() - lcs_length) + (s2.length() - lcs_length));
    }
}
