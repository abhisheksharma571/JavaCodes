package HashMap;

import java.util.HashMap;
import java.util.Map;

//Given an array, find the most frequent elements in it. If there are multiple elements that appear a maximum number of times, print any one of them.
public class mostFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,1,4,4,6,4,4,6,8};
        Map<Integer, Integer> freq = new HashMap<>();
        for(int ele : arr){
            if(!freq.containsKey(ele)){
                freq.put(ele,1);
            } else {
                freq.put(ele, freq.get(ele)+1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());

        int maxFreq = 0, ansKey = 0;
        for(var e : freq.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times", ansKey, maxFreq);
        System.out.println();

        //OR
        for(var key : freq.keySet()){
            if(freq.get(key)>maxFreq){
                maxFreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times", ansKey, maxFreq);
    }
}
