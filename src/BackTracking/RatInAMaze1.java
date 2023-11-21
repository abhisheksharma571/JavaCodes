package BackTracking;
//Rat in a maze-1 (2 directions)
//no need of backtracking
public class RatInAMaze1 {
    private static int maze(int sr, int sc, int er, int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int downWays = maze(sr+1,sc,er,ec);
        int rightWays = maze(sr,sc+1,er,ec);
        int totalWays = downWays + rightWays;
        return totalWays;
    }
    private static void printPath(int sr, int sc, int er, int ec, String s){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.print(s+" ");
            return;
        }
        //go right
        printPath(sr,sc+1,er,ec,s+"R");
        //go down
        printPath(sr+1,sc,er,ec,s+"D");
    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int count = maze(1,1,rows,cols);
        System.out.println(count);
        //printing the path
        printPath(1,1,rows,cols,"");
    }
}
