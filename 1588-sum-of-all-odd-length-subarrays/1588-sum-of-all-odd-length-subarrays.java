class Solution {
    
      public int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int length = 1; i + length <= arr.length; length += 2) {
                for (int j = i; j < i + length; j++) {
                    totalSum += arr[j];
                }
            }
        }
        
        return totalSum;
    }
}