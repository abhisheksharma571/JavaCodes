package Assigmnent;

public class reverseString {
    static String stringReverse(String str){
        String reversedString = "";
        for(int i=str.length()-1;i>=0;i--){
            reversedString += str.charAt(i);
        }
        return reversedString;
    }
    public static void main(String[] args) {
        String str = "PWSKILLS";
        System.out.println("Original string is :"+str);
        System.out.println("Reversed String is :"+stringReverse(str));
    }
}
