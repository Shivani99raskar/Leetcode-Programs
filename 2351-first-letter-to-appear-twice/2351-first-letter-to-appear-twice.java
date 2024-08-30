class Solution {
    public char repeatedCharacter(String s) {
        Set<Character>set=new HashSet<>();
        for(char ch:s.toCharArray())
        {
            if(set.contains(ch))
            {
                return ch;
            }
            set.add(ch);
        }
        // This return statement is unreachable but necessary for compilation.
        throw new IllegalArgumentException("Input string must contain at least one letter that appears twice.");
    }
}