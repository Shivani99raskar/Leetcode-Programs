class Solution {
    public String reverseOnlyLetters(String s) {
       Stack<Character>stack=new Stack<>();
        StringBuilder result = new StringBuilder();
        for(Character ch:s.toCharArray())
        {
            if(Character.isAlphabetic(ch))
            {
                stack.push(ch);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
          if(Character.isAlphabetic(ch))
            {
               result.append(stack.pop());
            }
            else  
            {
               result.append(ch);
            }
        }
           return result.toString();
        }
     }
