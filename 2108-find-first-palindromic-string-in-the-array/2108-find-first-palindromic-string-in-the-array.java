class Solution {
    public boolean checkPalindrome(String str)
    {
    
    int left=0,right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
               return false; 
            }
            left++;
            right--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
       return Arrays.stream(words).filter(this::checkPalindrome).findFirst().orElse("");
        
    }
}