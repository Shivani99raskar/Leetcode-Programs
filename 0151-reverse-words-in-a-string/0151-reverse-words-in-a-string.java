class Solution {
    public String reverseWords(String s) {
       String[] str=s.split("\\s+"); 
        String outputString="";
        
        for(int i=str.length-1;i>=0;i--)
        {
            outputString=outputString+str[i]+" ";
        }
        return outputString.trim();
    }
}