package Loops;
//find the first multiple of 5 and 7
public class keywordBreak {
    public static void main(String[] args) {
        int num=1;
        while(true){
            if((num%5==0)&&(num%7==0)){
                System.out.println("Fount ans "+num);
                break;
            }
            num++;
        }
    }
}
