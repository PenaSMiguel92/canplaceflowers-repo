public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n > flowerbed.length)
            return false;
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1)
            return true;
        
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            
            if (i == 0 && i + 1 < flowerbed.length) {
                if ((flowerbed[i] == 0) && (flowerbed[i + 1] == 0))
                    count++;
            }
                
            if ((i >= 1) && (i + 1 < flowerbed.length)){
                if ((flowerbed[i - 1] == 0) && (flowerbed[i] == 0) && (flowerbed[i + 1] == 0))
                    count++;
            } 

            if (i == flowerbed.length - 1) {
                if ((flowerbed[i] == 0) && (flowerbed[i - 1] == 0))
                    count++;
            }
                
        }
        if (count >= n)
            return true;
        else    
            return false;
    } 
}
