class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
               nums[index]=nums[i];
                index++;
            }
        }
        for(int i=index;i<nums.length;i++)
        {
            nums[i]=0;
        }
    }
}