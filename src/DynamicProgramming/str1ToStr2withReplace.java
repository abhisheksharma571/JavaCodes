package DynamicProgramming;
//Edit str1 to make str2 :
//Given two strings str1 and str2 and below operations that can be performed on str1. Find the minimum number of edits (operations) required to convert
//str1 to str2.
//1.Insert 2.Remove 3. Replace
//All of the above operations are of equal cost.
public class str1ToStr2withReplace {
    int rec(int i, int j, String str1, String str2){
        if(1==-1){
            
        }
        if(str1.charAt(i) == str2.charAt(j))
            return rec(i-1,j-1, str1, str2);

        int replace = 1 + rec(i-1,j-1, str1, str2);
        int insertion = 1 + rec(i,j-1, str1, str2);
        int deletion = 1 + rec(i-1,j, str1, str2);

        return Math.min(replace, Math.min(insertion, deletion));
    }
    public static void main(String[] args) {
        String str1 = "SUNDAY";
        String str2 = "SATURDAY";
    }

}
