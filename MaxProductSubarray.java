
//https://leetcode.com/problems/maximum-product-subarray/

class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                //swap currMax and currMin
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(nums[i], currMax * nums[i]);
            currMin = Math.min(nums[i], currMin * nums[i]);

            maxSoFar = Math.max(maxSoFar, currMax);
        }

        return maxSoFar;

    }

    public static void main(String[] args) {
        MaxProductSubarray sol = new MaxProductSubarray();  //Use class name correctly

        //Strictly given input
        int[] nums1 = {2, 3, -2, 4};
        System.out.println("Output for [2,3,-2,4]: " + sol.maxProduct(nums1));  //Expected 6

        int[] nums2 = {-2,0,-1};
        System.out.println("Output for [-2,0,-1]: " + sol.maxProduct(nums2));  //Expected 0
    }
}