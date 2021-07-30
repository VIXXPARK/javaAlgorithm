class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o1 -> o1[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        int[][] ans = new int[intervals.length][2];
        int cur = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (end >= intervals[i][0]) {
                if (end <= intervals[i][1]) {
                    end = intervals[i][1];
                }
            } else {
                ans[cur][0] = start;
                ans[cur][1] = end;
                start = intervals[i][0];
                end = intervals[i][1];
                cur++;
            }
        }
        ans[cur][0] = start;
        ans[cur][1] = end;
        int[][] res = new int[cur + 1][2];
        for (int i = 0; i <= cur; i++) {
            res[i][0] = ans[i][0];
            res[i][1] = ans[i][1];
        }
        return res;
    }
}