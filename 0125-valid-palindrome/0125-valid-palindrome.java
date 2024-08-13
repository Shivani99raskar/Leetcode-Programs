class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            str.append(Character.toLowerCase(c));
        }
        String original=str.toString();
        String reverse=str.reverse().toString();
        return original.equals(reverse);
    }
}