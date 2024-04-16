package BackTracking;
//Sudoku Solver - Leet-code 37
public class sudokuSolver {
    static int check = 0;
    public static boolean isValid(char board[][],int row, int col, int num){
        //check row
        for(int j=0;j<9;j++){
            if(board[row][j]==num) return false;
        }
        //check col
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }
        //check 3*3 grid
        int sRow = row/3*3;
        int sCol = col/3*3;
        for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
    public static void solve(char board[][], int row, int col){
        if(row==9){
            check = 1;
            return;
        }
        else if(board[row][col]!='.'){
            if(col!=8) solve(board,row,col+1);
            else solve(board,row+1,0);
        }
        else{
            for(char ch ='1';ch<='9';ch++){
                if(isValid(board,row,col,ch)){
                    board[row][col] = ch;
                    if(col!=8) solve(board,row,col+1);
                    else solve(board,row+1,0);
                    if(check == 1) return;
                    board[row][col] = '.';  //backtracking
                }
            }
        }
    }
    public static void solveSudoku(char board[][]){
        solve(board,0,0);
        //printing
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        check = 0;    //this line is useful in leetcode because after testing one case leetcode do not make it(static variable) 0 by its own
    }
    public static void main(String[] args) {
        char board[][] = {{'5','3','.','.','7','.','.','.','.'}
                         ,{'6','.','.','1','9','5','.','.','.'}
                         ,{'.','9','8','.','.','.','.','6','.'}
                         ,{'8','.','.','.','6','.','.','.','3'}
                         ,{'4','.','.','8','.','3','.','.','1'}
                         ,{'7','.','.','.','2','.','.','.','6'}
                         ,{'.','6','.','.','.','.','2','8','.'}
                         ,{'.','.','.','4','1','9','.','.','5'}
                         ,{'.','.','.','.','8','.','.','7','9'}};
        solveSudoku(board);
    }
}
