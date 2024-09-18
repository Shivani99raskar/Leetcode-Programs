class Solution {
    public int countSegments(String s) {
       s = s.trim();
        
        if (s.isEmpty()) {
            return 0;
        }
        
       
        String[] strArray = s.split("\\s+");
        
        
        return strArray.length;
    }
}