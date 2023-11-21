package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Leet-code - 435 : Given an array of intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make
//the rest of the intervals non-overlapping.
public class nonOverlappingIntervals {
    private static class Interval{
        int startTime;
        int endTime;
        public Interval(int startTime, int endTime){
            this.startTime = startTime;
            this.endTime = endTime;
        }
        public String toString() {
            return startTime + "-" + endTime;
        }
    }
    private static class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval i1, Interval i2){
            if(i1.startTime > i2.startTime){
                return 1;
            }
            else if(i1.startTime < i2.startTime){
                return -1;
            }
            else return 0;
        }
    }
    public static void main(String[] args) {
        List<Interval> intervalList = new ArrayList<>();
        intervalList.add(new Interval(1,2));
        intervalList.add(new Interval(2,3));
        intervalList.add(new Interval(3,4));
        intervalList.add(new Interval(1,3));

        intervalList.sort(new IntervalComparator());

        int result = 0;
        int previousEndTime = intervalList.get(0).endTime;
        for(int i=1;i<intervalList.size();i++){
            //check if overlap and remove
            Interval current = intervalList.get(i);
            if(current.startTime < previousEndTime){
                //chhote wale ko previous banado
                previousEndTime = Math.min(current.endTime, previousEndTime);
                result++;
            } else {
                previousEndTime = current.endTime;
            }
        }
        System.out.println(result);
    }
}
