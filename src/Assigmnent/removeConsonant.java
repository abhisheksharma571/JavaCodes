package Assigmnent;


public class removeConsonant {
    private static boolean isConsonant(char c) {
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != ' ';
    }
    public static void main(String[] args){
        String str = "Hello, have a good day";
        String ans = "";
        for(char c:str.toCharArray()){
            if(!isConsonant(c)){
                ans += c;
            }
        }
        System.out.println(ans);
    }
}
