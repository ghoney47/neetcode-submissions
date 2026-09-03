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
        int[] starts = new int[intervals.size()];
        int[] ends = new int[intervals.size()];

        // adding start and end intervals
        for (int i = 0; i < intervals.size(); i++){
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int e = 0; 
        int s = 0;
        int rooms = 0;
        int temp = 0;
        while (s < intervals.size()){

            // if the start is less than end we move to the next start time
            if (starts[s] < ends[e]){
                temp++;
                s++;
            } else {
                temp--;
                e++;
            }

            rooms = Math.max(rooms, temp);
        }


        return rooms;
    }
}
