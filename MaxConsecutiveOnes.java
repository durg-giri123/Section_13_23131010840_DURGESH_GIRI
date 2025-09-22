//https://leetcode.com/problems/max-consecutive-ones/

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;

    }

    //main method for testunf only
    public static void main(String[] args) {
        MaxConsecutiveOnes sol = new MaxConsecutiveOnes();

        //Test case 1
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Output: " + sol.findMaxConsecutiveOnes(nums1));
        //Expected 3

        //Test case 2
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Output: " + sol.findMaxConsecutiveOnes(nums2));
        //Expected 3


    }
}

