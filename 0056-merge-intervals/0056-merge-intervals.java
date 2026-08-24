class Solution {
    public int[][] merge(int[][] intervals) {
       // 1. Sort according to starting point
        Arrays.sort(intervals, (a, b) ->(a[0]-b[0]));

        // 2. Store merged intervals
        List<int[]> result = new ArrayList<>();

        // 3. Start with the first interval
        int[] current = intervals[0];

        // 4. Process remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            int[] next = intervals[i];

            // 5. Check if current and next overlap
            if (next[0] <= current[1]) {

                // Merge them
                current[1] = Math.max(current[1], next[1]);

            } else {

                // No overlap → current interval is complete
                result.add(current);

                current = next;
            }
        }

        // 6. Don't forget the last interval
        result.add(current);

        return result.toArray(new int[result.size()][]);

    }
}