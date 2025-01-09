class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int n=pref.length();
        for(String s:words){
            if(s.length()>=n && s.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}