package DynamicProgramming;
//Given a string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
//'.' Matches any single character. '*' Matches zero or more of the preceding element.
//The matching should cover the entire input string (not partial).
public class regexMatching {
    private static boolean rec(int i, int j, String s, String p) {
        if(j==-1 || i==-1) return true;

        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
            return rec(i-1, j-1, s, p);
        } else if(p.charAt(j) == '*') {
            return rec(i-1, j, s, p) || rec(i, j-1, s, p);  //ignore or take
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "abbbacc";
        String p = "*a*";

        System.out.println(rec(s.length()-1, p.length()-1, s, p));
    }
}
