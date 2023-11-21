package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//Leet-code
//There is one meeting room in a firm. There are N meetings in the form of (S[i],F[i]) where S[i] is the start time of meeting i and F[i] is the finish time of meeting i.
//The task id to find the maximum number of meetings that can accommodated in the meeting room. print all meeting numbers.
public class maxMeetingsInOneRoom {
    private static class Meeting{
        Integer startTime;
        Integer finishTime;
        Integer meetingNumber;
        public String toString(){
            return startTime+" "+finishTime;
        }
    }
    private static class MeetingComparator implements Comparator<Meeting> {
        public int compare(Meeting m1, Meeting m2){
            if(m1.finishTime > m2.finishTime){
                return 1;
            } else if(m1.finishTime < m2.finishTime){
                return -1;
            } else {
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> start = List.of(1,3,0,5,8,5);
        List<Integer> finish = List.of(2,4,6,7,9,9);
        List<Meeting> meetings = new ArrayList<>();
        for(int i=0;i< start.size();i++){
            Meeting meeting = new Meeting();
            meeting.startTime = start.get(i);
            meeting.finishTime = finish.get(i);
            meeting.meetingNumber = i + 1;
            meetings.add(meeting);
        }
        meetings.sort(new MeetingComparator());
        List<Integer> result = new ArrayList<>();
        result.add(meetings.get(0).meetingNumber);
        Meeting onGoingMeeting = meetings.get(0);
        for(int i=1;i<meetings.size();i++){
            Meeting currentMeeting = meetings.get(i);
            if(currentMeeting.startTime > onGoingMeeting.finishTime){
                result.add(currentMeeting.meetingNumber);
                onGoingMeeting = currentMeeting;
            }
        }
        System.out.println(meetings);
        System.out.println(result);
    }
}
