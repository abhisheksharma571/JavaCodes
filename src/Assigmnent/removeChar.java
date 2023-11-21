package Assigmnent;

public class removeChar {
    public static void removeCharacter(String str,char characterToRemove){
        String newString = "";
        System.out.println("Original string :"+str);
        for (int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)!=characterToRemove){
                newString += str.charAt(i);
            }
        }
        System.out.println("String after removing 'e' is :"+newString);
    }
    public static void main(String[] args) {
        String str = "Abhishek";
        char characterToRemove = 'e';
        removeCharacter(str,characterToRemove);
    }
}
