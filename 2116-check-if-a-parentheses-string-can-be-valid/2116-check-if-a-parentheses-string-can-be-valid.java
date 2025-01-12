class Solution {
    public boolean canBeValid(String s, String locked) {
     int n = s.length();
    
       if (n % 2 != 0) {
            return false;
       }

       int balance = 0;
       int flexible = 0;

       for (int i=0; i<n; i++) {
            if (locked.charAt(i) == '1') {
                balance += (s.charAt(i) == '(' ? 1 : -1);
            } else {
                flexible++;
            }
            if (balance + flexible < 0) {
                return false;
            }
       }


       balance = 0;
       flexible = 0;

       for (int i=n-1; i>=0; i--) {
            if (locked.charAt(i) == '1') {
                balance += (s.charAt(i) == ')' ? 1 : -1);
            } else {
                flexible++;
            }
            if (balance + flexible < 0) {
                return false;
            }
       }
       return true;
    }
}