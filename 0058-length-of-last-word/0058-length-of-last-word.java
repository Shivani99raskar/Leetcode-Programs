class Solution {
    public int lengthOfLastWord(String s) {
        String []stringArray=s.split(" ");
        Integer index = stringArray[stringArray.length-1].length();
        
        return index;
    }
}