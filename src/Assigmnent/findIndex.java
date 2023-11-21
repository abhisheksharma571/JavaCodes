package Assigmnent;

public class findIndex {
    static int indexOfSubString(String str, String subString){
        int index = -1;
        for(int i=0;i<str.length()-subString.length()+1;i++){
                if(str.substring(i,i+subString.length()).equals(subString)){
                    index = i;
                    break;
                }
        }
        return index;
    }
    public static void main(String[] args) {
        String str = "Abhishek";
        String subStr = "she";   //sub string
        str.concat(subStr);
        System.out.println(str);
        int i = indexOfSubString(str,subStr);
        System.out.println(i);
    }
}
