package package1;
import java.util.*;
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Sol057 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> ret = new ArrayList<Interval>();
        if(intervals.size() == 0)   ret.add(newInterval);
        for(int i = 0; i < intervals.size(); i++){
            Interval cur = intervals.get(i);
            if(cur.start < newInterval.start && cur.end >= newInterval.start){
                newInterval.start = cur.start;
            }
            if(cur.start <= newInterval.end && cur.end > newInterval.end){
                newInterval.end = cur.end;
            }
            if(cur.end < newInterval.start && cur.start < newInterval.start){
                ret.add(cur);
            }
            if(cur.start > newInterval.end && cur.end > newInterval.end){
                if(!ret.contains(newInterval)){
                        ret.add(newInterval);
                }
                ret.add(cur);
            }
            //else: surrounded -> ignore
        }
        if(!ret.contains(newInterval)){
                ret.add(newInterval);
        }
        return ret;
    }
}