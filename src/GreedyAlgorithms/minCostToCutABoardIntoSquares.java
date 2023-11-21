package GreedyAlgorithms;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/*
A board of length M and width N is given. The task is to break this board into M*N squares such that cost of breaking is minimum. The cutting cost
 for each edge will be given for the board in two arrays X[] and Y[]. In short, you need to choose such a sequence of cutting such that cost is minimized.
 Return the minimized cost.
 */
public class minCostToCutABoardIntoSquares {
    public static void main(String[] args) {
        int M =6, N = 4;
        List<Integer> X = new ArrayList<>();   //vertical cuts
        List<Integer> Y = new ArrayList<>();   //horizontal cuts
        X.add(2); X.add(1); X.add(3); X.add(1); X.add(4);
        Y.add(4); Y.add(1); Y.add(2);
        X.sort(Comparator.reverseOrder());
        Y.sort(Comparator.reverseOrder());
        int noOfVerticalPiece = 1;
        int noOfHorizontalPiece = 1;
        int totalCost = 0;

        int i = 0, j = 0;
        while(i<M-1 && j<N-1){
            if(X.get(i) > Y.get(j)){
                totalCost += X.get(i) * noOfHorizontalPiece;
                noOfVerticalPiece++;
                i++;
            }
            else {
                totalCost += Y.get(j) * noOfVerticalPiece;
                noOfHorizontalPiece++;
                j++;
            }
        }
        while(i < M-1){
            totalCost += X.get(i) * noOfHorizontalPiece;
            i++;
        }
        while(j < N-1){
            totalCost += Y.get(j) * noOfVerticalPiece;
            j++;
        }
        System.out.println(totalCost);
    }
}
