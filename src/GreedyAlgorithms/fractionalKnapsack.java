package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Leet-code - 10
//Given the weights and profits of N items, in the form of {profit, weight} put these items in a knapsack of capacity W to get the maximum total profit
//in the knapsack. In Factorial Knapsack, we can break items for maximizing the total value of the knapsack.
public class fractionalKnapsack {
    private static class Item{
        Integer value;
        Integer weights;
        public String toString(){
            return value+" "+weights;
        }
    }
    private static class ItemComparator implements Comparator<Item> {
        public int compare(Item i1, Item i2){
            if(i1.value/i1.weights < i2.value/i2.weights){
                return 1;
            } else if(i1.value/i1.weights > i2.value/i2.weights){
                return -1;
            } else {
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> weights = List.of(10,20,50,15);
        List<Integer> value = List.of(60,100,150,120);
        List<Item> itemsList = new ArrayList<>();
        for(int i=0;i< value.size();i++){
            Item item = new Item();
            item.value = value.get(i);
            item.weights = weights.get(i);
            itemsList.add(item);
        }
        itemsList.sort(new ItemComparator());
        System.out.println(itemsList);
        int w = 30;    //my capacity in weight
        int profit = 0;
        while(w > 0){
            for(int i=0;i< itemsList.size() && w > 0;i++){
                Item item = itemsList.get(i);
                if(item.weights < w){
                    profit += item.value;
                    w -= item.weights;
                } else {
                    profit += (item.value) / item.weights * w;
                    w = 0;
                }   // 120 + 60 + 25 = 205
            }
            System.out.println(profit);
        }
    }
}
