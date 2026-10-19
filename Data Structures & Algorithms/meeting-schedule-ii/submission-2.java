/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        if(intervals.size() == 0){
            return 0;
        }
        pq.add(intervals.get(0).end);
        int rooms = 1;
        for(int i = 1; i < intervals.size(); i ++){
            if(intervals.get(i).start < pq.peek()){
                rooms++;
                pq.add(intervals.get(i).end);
            }else{
                pq.poll();
                pq.add(intervals.get(i).end);
            }
        }
        return pq.size();
    }
}
