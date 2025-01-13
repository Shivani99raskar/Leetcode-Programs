class Solution {
    public int minimumLength(String s) {
        int[] frequencies = new int[26];
        int length = s.length();

        for(int i = 0; i < length; i++){
            frequencies[s.charAt(i) - 'a']++;
        }

        length = 0;
        
        for(int i = 0; i < 26; i++){
            if(frequencies[i] < 3)
                length += frequencies[i];
            else
                length += (frequencies[i] % 2 == 0) ? 2 : 1;
        }
        
        return length;
    }
}