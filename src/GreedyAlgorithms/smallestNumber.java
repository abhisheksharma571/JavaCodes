package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.List;

//The task is to find the smallest number with given sum of digits as S and number of digits as D.
public class smallestNumber {
    public static void main(String[] args) {
        int S = 9;
        int D = 2;
        if(S == 0 || S > D*9){
            System.out.println("Not possible");
            return;
        }
        //save 1 and move from right to left and try to put maximum(9)
        S -= 1;
        List<Integer> number = new ArrayList<>();
        //initialize number list with 0
        for(int i=0;i<D;i++){
            number.add(0);
        }
        //make first digit 1
        number.set(0,1);
        //right to left
        for(int i=D-1;i>=0;i--){
            if(S > 9){
                number.set(i,9);
                S-=9;
            }
            else {
                number.set(i,S);
                S = 0;
                break;
            }
        }
        //starting wala aur remaining ka sum
        number.set(0,S+1);
        System.out.println(number);
    }
}
