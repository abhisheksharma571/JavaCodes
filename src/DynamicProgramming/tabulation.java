package DynamicProgramming;
//(Fibonacci) - problem on tabulation(saves spaces)
//Steps to solve by tabulation :-
//1.write recursive solution  - TC:O(2^n), SC:O(n)
//2.memoize it                - TC:O(n), SC:O(n) + O(n)
//3.Tabulation : a. use base condition to build dp array
//               b. use recurrence relation on your dp array
//               c. space optimize this      - TC:O(n), SC:O(1)
public class tabulation {
    public static void main(String[] args) {
        int n = 10;
        int prev1 = 1;
        int prev2 = 1;
        int current = 0;
        for(int i=3;i<=n;i++){
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        System.out.println(current);
    }
}
