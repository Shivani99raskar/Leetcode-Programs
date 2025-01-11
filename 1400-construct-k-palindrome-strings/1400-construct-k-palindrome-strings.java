class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length();
        if(k>n)
          return false;
        if(k==n)
          return true;
        int[] count=new int[26];
        for(char ch:s.toCharArray())
        {
            count[ch-'a']++;
        }
        int oddCnt=0;
        for(int i=0;i<26;i++)
        {
            if(count[i]%2!=0)
              oddCnt++;
        }
        if(oddCnt<=k && k<=n)
          return true;
        return false;
    }
}