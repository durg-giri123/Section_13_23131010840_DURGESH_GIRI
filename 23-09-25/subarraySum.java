
    import java.util.*;

    class subarraySum {
        public int subarraySum(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);  //base case

            int count = 0, prefixSum = 0;

            for (int num : nums) {
                prefixSum += num;

                if (map.containsKey(prefixSum - k)) {
                    count += map.get(prefixSum - k);
                }

                map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
            }

            return count;

        }

        public static void main(String[] args) {
            subarraySum sol = new subarraySum();

            int[] nums1 = {1, 1, 1};
            int k1 = 2;
            System.out.println("Output for [1,1,1], k=2: " + sol.subarraySum(nums1, k1)); // Expected 2

            int[] nums2 = {1, 2, 3};
            int k2 = 3;
            System.out.println("Output for [1,2,3], k=3: " + sol.subarraySum(nums2, k2)); // Expected 2
        }
    }


