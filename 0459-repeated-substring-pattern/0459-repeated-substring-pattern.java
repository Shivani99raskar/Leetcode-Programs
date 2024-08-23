class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String concat=s+s;
        String modified=concat.substring(1,concat.length()-1);
      return  modified.contains(s);
    }
}