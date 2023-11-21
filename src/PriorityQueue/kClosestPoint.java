package PriorityQueue;

//You are given a set of points in a XY plane. You need to find the k closest points to the origin. It is guaranteed that no 2 points will have the same distance from the origin.

import java.util.Comparator;
import java.util.PriorityQueue;

public class kClosestPoint {
    private static class Point{
        int x;
        int y;
        double distance;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.distance = Math.sqrt(x * x + y * y);
        }
    }
    private static class PointComparator implements Comparator<Point>{
        public int compare(Point p1, Point p2){
            return Double.compare(p2.distance, p1.distance);
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Point> pointPriorityQueue = new PriorityQueue<>(new PointComparator());   //max heap
        Point[] points = new Point[] {
                new Point(5,3),
                new Point(1,2),
                new Point(3,4),
                new Point(5,6),
                new Point(7,8)
        };
        int k = 3; // number of closest points you want to find

        for(Point point : points){
            pointPriorityQueue.add(point);
            if(pointPriorityQueue.size() > k){
                pointPriorityQueue.poll();
            }
        }

        // Now the queue contains k closest points to the origin
        while(!pointPriorityQueue.isEmpty()){
            Point p = pointPriorityQueue.poll();
            System.out.println("Point: (" + p.x + ", " + p.y + "), Distance: " + p.distance);
        }
    }
}