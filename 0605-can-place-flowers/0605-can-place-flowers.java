class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0){
            return true;
        } 

         for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0 && (i == flowerbed.length - 1 || flowerbed[i+1] == 0) && (i == 0 || flowerbed[i-1] == 0)) {
                flowerbed[i] = 1;
                n--;  
                i++; 
            } else if(flowerbed[i] == 1) {
                i++;
            }

            if(n == 0) {
                break;
            }
        }

        return n == 0;
    }
}