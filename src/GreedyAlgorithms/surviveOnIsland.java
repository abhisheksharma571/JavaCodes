package GreedyAlgorithms;
//Check if it is possible to survive on island
/*You are a person in an island. There is only one shop in this island, this shop is open on all days of the week except for sunday. Consider following constraints:
S- Number of days you are required to survive.
N- Maximum unit of food you can buy each day.
M- Unit of food required each day to survive.
Currently,it's Monday, and you need to survive for next S days.
Find the minimum number of days on which you need to buy food from the shop so that you can survive the next S days, or determine that it isn't possible to survive.
* */
public class surviveOnIsland {
    public static void main(String[] args) {
        int S = 10;
        int N = 16;
        int M = 2;
        int total_food_required = S * M;
        int result;
        //1 hafte ki consumption > 1 hafte ki buy
        if(M > N || (7*M) > (6*N)){
            result = -1;
        } else {
            result = (int)Math.ceil((double)total_food_required / N);
        }
        System.out.println(result);
    }
}
