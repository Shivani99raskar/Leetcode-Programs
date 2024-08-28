import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
       //Integer result = Integer.valueOf(num1) + Integer.valueOf(num2);
       // return result.toString();
         return ((new BigInteger(num1)).add(new BigInteger(num2))).toString();
    }
}