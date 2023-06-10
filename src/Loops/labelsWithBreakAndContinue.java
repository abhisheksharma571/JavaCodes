package Loops;
//we can give name to any loop to further apply break and continue keywords accordingly
public class labelsWithBreakAndContinue {
    public static void main(String[] args) {
        myloop:for(int num=1;num<=50;num++){
            if(num%3==0){
                continue myloop;
            }
            System.out.println(num);
        }
    }
}
