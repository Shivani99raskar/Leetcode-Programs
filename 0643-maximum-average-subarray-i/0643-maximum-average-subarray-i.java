class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double average=0.0;

       for(int i = 0 ;i<k ;i++){
        average = average+nums[i];
       }
       double maxSoFar = average;


       for(int start = 0 ,  end = k; end <nums.length ; start++ , end++){
        average = average-nums[start]+nums[end];
        maxSoFar= Math.max(maxSoFar , average);
       }
       return Math.max(maxSoFar , average)/(double)k;
        
    }
}