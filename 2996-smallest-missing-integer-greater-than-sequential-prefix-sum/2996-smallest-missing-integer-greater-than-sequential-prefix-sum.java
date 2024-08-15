class Solution {
public int missingInteger(int[] nums) {
int sum = 0;
int expected = nums[0];

    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==expected)
        {
            sum=sum+nums[i];
        expected++;
        }
        else
        {
            break;
        }
    }
    
    Set<Integer>numSet=new HashSet<>();
     for (int number : nums) {
        numSet.add(number);
    }
 int smallestMissing = sum;
        while (numSet.contains(smallestMissing)) {
            smallestMissing++;
        }

        return smallestMissing;
}
}