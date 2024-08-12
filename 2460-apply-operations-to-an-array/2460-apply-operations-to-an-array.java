class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int resultArray[]=new int[n];
        int index=0;
        for(int x:nums)
        {
            if(x!=0)
            {
                resultArray[index]=x;
                index++;
            }
        }
        return resultArray;
    }
}