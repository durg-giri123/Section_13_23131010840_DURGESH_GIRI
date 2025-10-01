//public class nextpermutation {
    import java.util.*;

    class Solution {
        public void nextPermutation(int[] nums) {
            int n = nums.length;
            int i = n - 2;

            //Step 1: find pivot
            while (i >= 0 && nums[i] > nums[i + 1]) {
                i--;
            }

            if (i >= 0) {
                int j = n - 1;
                //step 2: find successor
                while (nums[j] <= nums[i]) {
                    j--;
                }

                swap(nums, i, j);
            }

            //step 3: reverse suffix
            reverse(nums, i + 1, n - 1);

        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        private void reverse(int[] nums, int start, int end) {
            while (start < end) {
                swap(nums, start, end);
                start++;
                end--;
            }
        }

        //main method for running
        public static void main(String[] args) {
            Solution sol = new Solution();
            int[] nums = {1, 2, 3};

            sol.nextPermutation(nums);

            System.out.println("Next permutation: " + Arrays.toString(nums));
        }
    }


