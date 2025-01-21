class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];

        int prod = 1;
        int prodWithoutZero = 1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
            prod = prod * nums[i];
            
            if (nums[i] != 0) {
                prodWithoutZero = prodWithoutZero * nums[i];
            }   
        }
        
        if (count > 1) {
            int[] res = new int[nums.length];
            Arrays.fill(res, 0);
            return res;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                arr[j] = prodWithoutZero;
            } else {
                arr[j] =prod/nums[j];
            }     
        }

        return arr;
    }
}