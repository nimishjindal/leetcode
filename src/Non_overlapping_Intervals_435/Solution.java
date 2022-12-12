package Non_overlapping_Intervals_435;

import java.util.Arrays;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] != b[0]) ? (a[0] - b[0]) : (a[1] - b[1]));
        int size = intervals.length;
        int ans = 0;
        int endPrev = intervals[0][1];
        for (int i = 1; i < size; i++) {
            int start = intervals[i][0], end = intervals[i][1];
            if (start < endPrev) {
                ans++;
                endPrev = Math.min(endPrev, end);
            } else
                endPrev = end;
        }
        return ans;
    }
}
