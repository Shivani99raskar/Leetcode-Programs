class Solution {
    public String reverseVowels(String s) {
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||
              c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                stack.push(c);
            }
        }
        String result="";
        for(int i=0;i<s.length();i++)
        { char c=s.charAt(i);
         if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||
               c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                result=result+stack.pop();
            }
         else
         {
             result=result+c;
         }
        }
         return result;
    }
   
}