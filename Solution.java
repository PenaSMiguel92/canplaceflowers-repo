public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {

            if ((i == 0) && (flowerbed[i] == 0) && (flowerbed[i + 1] == 0))
                count++;

            if ((i >= 1) && (flowerbed[i - 1] == 0) && (flowerbed[i] == 0) && (flowerbed[i + 1] == 0))
                count++;

            if ((i == flowerbed.length - 1) && (flowerbed[i] == 0) && (flowerbed[i - 1] == 0))
                count++;
        }
        if (count >= n)
            return true;
        else    
            return false;
    } 
}
