class Solution {
    public int smallestDistancePair(int[] nums, int k) {
      Arrays.sort(nums); 
        int n = nums.length;
        int left = 0;
        int right = nums[n - 1] - nums[0];

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = countPairsWithDistanceLessThanOrEqual(nums, mid);

            if (count >= k) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }

        return left;
    }

    private static int countPairsWithDistanceLessThanOrEqual(int[] nums, int dist) {
        int count = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            while (j < nums.length && nums[j] - nums[i] <= dist) {
                j++;
            }
            count += j - i - 1; 
        }

        return count;
    }
}