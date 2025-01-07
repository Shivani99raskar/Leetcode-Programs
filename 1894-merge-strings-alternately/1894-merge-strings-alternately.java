class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1=word1.length();
        int length2=word2.length();
        StringBuilder sb=new StringBuilder();
        int p1=0,p2=0;
        while(p1<length1||p2<length2)
        {
            if(p1<length1)
            {
                sb.append(word1.charAt(p1));
                p1++;
            }
            if(p2<length2)
            {
                sb.append(word2.charAt(p2));
                p2++;
            }
        }
        return sb.toString();
    }
}