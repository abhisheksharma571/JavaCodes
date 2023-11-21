package BackTracking;
/* A maze in an N*M binary of blocks where the upper left block is known as the source block, and the lower rightmost block is known as the destination
block. If we consider the maze, then maze[0][0] is the source block, and maze[N-1][M-1] is the destination block. Our main task is to reach the
destination from the source. We have considered a rat as a character that can move either forward or downward or leftward or rightward.
In the maze matrix, a few dead blocks will be denoted by 0 and active blocks will be denoted by 1. A rat can move only in the active blocks.
* */
public class RatInAMaze3 {
    private static void printPathTwoDirection(int sr, int sc, int er, int ec, String s, int[][] maze){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.print(s+" ");
            return;
        }
        if(maze[sr][sc] == 0) return;
        //go right
        printPathTwoDirection(sr,sc+1,er,ec,s+"R",maze);
        //go down
        printPathTwoDirection(sr+1,sc,er,ec,s+"D",maze);
    }
    private static void printPathFourDirection(int sr, int sc, int er, int ec, String s, int[][] maze){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(maze[sr][sc] == -1) return;   //visited
        if(sr==er && sc==ec){
            System.out.print(s+" ");
            return;
        }
        if(maze[sr][sc] == 0) return;    //dead block
        maze[sr][sc] = -1;
        //go right
        printPathFourDirection(sr,sc+1,er,ec,s+"R",maze);
        //go down
        printPathFourDirection(sr+1,sc,er,ec,s+"D",maze);
        //go left
        printPathFourDirection(sr,sc-1,er,ec,s+"L",maze);
        //go up
        printPathFourDirection(sr-1,sc,er,ec,s+"U",maze);
        //backtracking
        maze[sr][sc] = 1;
    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze = {
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
        };
        //printing the path - forward or downward
        printPathTwoDirection(0,0,rows-1,cols-1,"",maze);
        System.out.println();
        //printing the path - forward or downward or leftward or rightward
        printPathFourDirection(0,0,rows-1,cols-1,"",maze);
    }
}
