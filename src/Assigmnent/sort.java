package Assigmnent;

public class sort {
    public static String sortStringAlphabetically(String str) {
        StringBuilder sortedStr = new StringBuilder();
        for (char c : str.toCharArray()) {
            int index = 0;
            while (index < sortedStr.length() && sortedStr.charAt(index) < c) {
                index++;
            }
            sortedStr.insert(index, c);
        }
        return sortedStr.toString();
    }
    public static void main(String[] args) {
        String str = "ABHISHEK";
        String sortedStr = sortStringAlphabetically(str);
        System.out.println(sortedStr);
    }
}

