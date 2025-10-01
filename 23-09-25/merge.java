import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        //step 1: sort intervals by start time
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        //step 2: traverse and merge
        for (int[] interval : intervals) {
            if (merged.isEmpty() || interval[0] > merged.get(merged.size() - 1)
                    [1]) {

                merged.add(interval);  //no overlap
            } else {
                merged.get(merged.size() - 1)[1] =
                        Math.max(merged.get(merged.size()- 1)[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);

    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merged1 = sol.merge(intervals1);
        System.out.println("Merged intervals:");
        for (int[] interval : merged1) {
            System.out.println(Arrays.toString(interval));
        }
        // Expected: [[1,6],[8,10],[15,18]]

        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] merged2 = sol.merge(intervals2);
        System.out.println("Merged intervals:");
        for (int[] interval : merged2) {
            System.out.println(Arrays.toString(interval));
        }
        // Expected: [[1,5]]
    }
}
