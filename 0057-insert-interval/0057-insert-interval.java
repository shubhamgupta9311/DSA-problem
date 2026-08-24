class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {


        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            // 1. Current interval is BEFORE newInterval
            if (intervals[i][1] < newInterval[0]) {
                result.add(intervals[i]);
            }

            // 2. Current interval is AFTER newInterval
            else if (intervals[i][0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = intervals[i];
            }

            // 3. Current interval OVERLAPS newInterval
            else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        // Add the final newInterval
        result.add(newInterval);

        return result.toArray(new int[result.size()][]);


    }
}