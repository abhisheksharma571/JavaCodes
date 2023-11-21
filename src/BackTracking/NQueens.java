package BackTracking;
//[Leet-Code] Consider an N*N chessboard. N Queen Problem is to accommodate N queens on the N*N chessboard such that no 2 queens can attack each other.
public class NQueens {
    private static void nQueen(char[][] board, int row){
        int n = board.length;
        if(row==n){  //base case
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueen(board,row+1);
                //backtracking
                board[row][j] = 'X';
            }
        }
    }
    private static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        //check row
        for(int j=0;j<n;j++){
            if(board[row][j] == 'Q') return false;
        }
        //check column
        for(int i=0;i<n;i++){
            if(board[i][col] == 'Q') return false;
        }
        //check north-east
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }
        //check south-east
        i = row;
        j = col;
        while(i<n && j<n){
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }
        //check south-west
        i = row;
        j = col;
        while(i<n && j>=0){
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }
        //check north-west
        i = row;
        j = col;
        while(i>=0 && j>=0){
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        nQueen(board,0);
    }
}
