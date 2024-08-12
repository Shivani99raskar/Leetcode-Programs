class Solution {
    public int removeDuplicates(int[] nums) {
       int addIndex=1;
		if(nums.length==0)
		{
			return 0;
		}
        for(int i=0;i<nums.length-1;i++)
        {
        	if(nums[i]<nums[i+1])
        	{
        		nums[addIndex]=nums[i+1];
        		addIndex++;
        	}
        }
        return addIndex;
    }
}