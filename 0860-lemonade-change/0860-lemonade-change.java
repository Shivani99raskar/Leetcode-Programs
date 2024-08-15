class Solution {
    public boolean lemonadeChange(int[] bills) {
     int five=0, ten=0;
        for(int cost:bills)
        {
            if(cost==5)
            five++;
            else if(cost==10)
            {
            ten++; five--;}
            else if(ten>0&&five>=1)
            { five--; ten--;}
            else
                five=five-3;
            if(five<0)
                return false;
        }
        return true;
    }
}