package LeetCode;



public class addStrings {
        public static String addString(String num1, String num2) {
            int i = num1.length()-1;
            int j = num2.length()-1;
            int carry = 0;
            StringBuilder result = new StringBuilder();
            while(i>=0 || j>=0){
                int sum = 0;
                if(i<0){
                sum = 0 + Character.getNumericValue(num2.charAt(j)) + carry;
                } else if(j<0){
                sum = Character.getNumericValue(num1.charAt(i)) + 0 + carry;

                } else {
                sum = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(j)) + carry;
                }
                if(sum>=10){
                    carry = 1;
                    sum %=10;
                } else {
                    carry = 0;
                }
                i--;
                j--;
                result.append(sum);
            }
            if(carry == 1){
                result.append(1);
            } else {
                result.reverse();
            }
            return result.toString();
        }

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        String ans = (addString(num1,num2));
        System.out.println(ans);
        
    }


}
