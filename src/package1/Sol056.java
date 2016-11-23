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
public class Sol056 {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> ret = new ArrayList<>();
        int n = intervals.size();
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                 return a.start - b.start;
            }
        });
        
        int idx = 0;
        while(idx < n){
            int start = intervals.get(idx).start;
            int end = intervals.get(idx).end;
            idx++;
            while(idx < n && intervals.get(idx).start <= end ){
                end = Math.max(end, intervals.get(idx).end);
                idx++;
            }
            ret.add(new Interval(start,end));
        }
        return ret;
    }
}